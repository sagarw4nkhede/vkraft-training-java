package com.vkraft.training.bankatmsimulation;

import java.util.Scanner;

public class BankATMSimulation {

	private static double balance = 10000.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				depositMoney(scanner);
				break;
			case 3:
				withdrawMoney(scanner);
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
	}

	private static void checkBalance() {
		System.out.println("Your current balance is: ₹" + balance);
	}

	private static void depositMoney(Scanner scanner) {
		System.out.print("Enter amount to deposit: ₹");
		double amount = scanner.nextDouble();
		if (amount > 0) {
			balance += amount;
			System.out.println("₹" + amount + " deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	private static void withdrawMoney(Scanner scanner) {
		System.out.print("Enter amount to withdraw: ₹");
		double amount = scanner.nextDouble();
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("₹" + amount + " withdrawn successfully.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
}
