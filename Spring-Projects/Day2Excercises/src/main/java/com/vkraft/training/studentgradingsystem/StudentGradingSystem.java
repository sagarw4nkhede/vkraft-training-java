package com.vkraft.training.studentgradingsystem;

import java.util.Scanner;

class Student {
	private String name;
	private double grade;

	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	public boolean hasFailed() {
		return grade < 40;
	}
}

public class StudentGradingSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numberOfStudents = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		Student[] students = new Student[numberOfStudents];
		double totalGrades = 0;

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("\nEnter details for student " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Grade: ");
			double grade = scanner.nextDouble();
			scanner.nextLine(); // Consume newline

			students[i] = new Student(name, grade);
			totalGrades += grade;
		}

		double averageGrade = totalGrades / numberOfStudents;

		System.out.println("\nStudent Results:");
		for (Student student : students) {
			System.out.println(
					student.getName() + " - Grade: " + student.getGrade() + (student.hasFailed() ? " (Failed)" : ""));
		}

		System.out.println("\nAverage Grade: " + String.format("%.2f", averageGrade));
		System.out.println("Thank you for using the Student Grading System!");
	}
}
