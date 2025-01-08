package com.vkraft.training.schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String name;
	private String rollNumber;
	private List<Double> grades;
	private int totalClasses;
	private int classesAttended;

	public Student(String name, String rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grades = new ArrayList<>();
		this.totalClasses = 0;
		this.classesAttended = 0;
	}

	public void displayDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Grades: " + grades);
		System.out.println("Attendance: " + String.format("%.2f", getAttendancePercentage()) + "%");
	}

	public void addGrade(double grade) {
		grades.add(grade);
	}

	public double calculateAverageGrade() {
		if (grades.size() == 0) {
			return 0;
		}
		double total = 0;
		for (double grade : grades) {
			total += grade;
		}
		return total / grades.size();
	}

	public void markAttendance(boolean attended) {
		totalClasses++;
		if (attended) {
			classesAttended++;
		}
	}

	public double getAttendancePercentage() {
		if (totalClasses == 0) {
			return 0;
		}
		return (double) classesAttended / totalClasses * 100;
	}
}

public class SchoolManagementSystem {
	public static void main(String[] args) {
		Student student = new Student("Sagar", "S12345");

		student.addGrade(85.0);
		student.addGrade(90.0);
		student.addGrade(78.5);

		student.markAttendance(true);
		student.markAttendance(false);
		student.markAttendance(true);

		student.displayDetails();

		System.out.println("Average Grade: " + student.calculateAverageGrade());
	}
}
