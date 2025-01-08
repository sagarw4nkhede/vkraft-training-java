package com.vkraft.training.employeeattendancetracker;

import java.util.Scanner;

public class EmployeeAttendanceTracker {

	public static void main(String[] args) {
		int numEmployees = 3;
		int numDays = 7;

		String[][] attendance = new String[numEmployees][numDays];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numEmployees; i++) {
			System.out.println("Enter attendance for Employee " + (i + 1) + ":");

			for (int j = 0; j < numDays; j++) {
				System.out.print("Day " + (j + 1) + " (Present/Absent): ");
				attendance[i][j] = scanner.next();
			}
			System.out.println();
		}

		System.out.println("\nAttendance for the week:");

		System.out.print("Employee\\Day  ");
		for (int j = 0; j < numDays; j++) {
			System.out.print("Day " + (j + 1) + "  ");
		}
		System.out.println();

		for (int i = 0; i < numEmployees; i++) {
			System.out.print("Employee " + (i + 1) + "  ");
			for (int j = 0; j < numDays; j++) {
				System.out.print(attendance[i][j] + "      ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
