package com.vkraft.training.banktransactionhistory;

import java.util.Scanner;

public class BankTransactionHistory {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 0.0;

		System.out.println("Welcome to the Bank!");

		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: 
				System.out.print("Enter amount to deposit: ₹");
				double depositAmount = scanner.nextDouble();
				if (depositAmount > 0) {
					balance += depositAmount;
					System.out.println("₹" + depositAmount + " deposited successfully.");
				} else {
					System.out.println("Invalid deposit amount. Please try again.");
				}
				break;

			case 2: 
				System.out.print("Enter amount to withdraw: ₹");
				double withdrawAmount = scanner.nextDouble();
				if (withdrawAmount > 0 && withdrawAmount <= balance) {
					balance -= withdrawAmount;
					System.out.println("₹" + withdrawAmount + " withdrawn successfully.");
				} else if (withdrawAmount > balance) {
					System.out.println("Insufficient balance. Please try again.");
				} else {
					System.out.println("Invalid withdrawal amount. Please try again.");
				}
				break;

			case 3: 
				System.out.println("Your current balance is: ₹" + balance);
				break;

			case 4: 
				System.out.println("Thank you for banking with us!");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);
		scanner.close();
	}
}
