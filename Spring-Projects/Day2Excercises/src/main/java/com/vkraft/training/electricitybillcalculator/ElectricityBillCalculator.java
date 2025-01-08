package com.vkraft.training.electricitybillcalculator;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of units consumed: ");
		int units = scanner.nextInt();

		double totalBill = calculateBill(units);

		System.out.println("Total electricity bill: $" + totalBill);

		scanner.close();
	}

	private static double calculateBill(int units) {
		double bill = 0;

		if (units <= 100) {
			bill = units * 1;
		} else if (units <= 200) {
			bill = 100 * 1 + (units - 100) * 2;
		} else {
			bill = 100 * 1 + 100 * 2 + (units - 200) * 3;
		}

		return bill;
	}
}
