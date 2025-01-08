package com.vkraft.training.bms;

class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	protected double balance;

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}

	@Override
	public String toString() {
		return "Account Holder: " + accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
	}
}

class SavingsAccount extends BankAccount {
	private static final double MINIMUM_BALANCE = 1000.0;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount < MINIMUM_BALANCE) {
			System.out.println("Withdrawal denied. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
		} else {
			super.withdraw(amount);
		}
	}
}

class CurrentAccount extends BankAccount {
	private static final double OVERDRAFT_LIMIT = 5000.0;

	public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("amount > 0 && balance - amount >= -OVERDRAFT_LIMIT"
				+ (amount > 0 && balance - amount >= -OVERDRAFT_LIMIT));
		if (amount > 0 && balance - amount >= -OVERDRAFT_LIMIT) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully (overdraft allowed).");
		} else {
			System.out.println("Withdrawal denied. Overdraft limit exceeded or invalid amount.");
		}
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("Sagar", "SA12345", 5000);
		CurrentAccount currentAccount = new CurrentAccount("Dhiraj", "CA54321", 2000);

		System.out.println("Savings Account Details:");
		System.out.println(savingsAccount);
		System.out.println();

		System.out.println("Current Account Details:");
		System.out.println(currentAccount);
		System.out.println();

		savingsAccount.deposit(2000);
		currentAccount.deposit(3000);

		savingsAccount.withdraw(4000);
		savingsAccount.checkBalance();
		savingsAccount.withdraw(3000);
		savingsAccount.checkBalance();

		currentAccount.withdraw(4000);
		currentAccount.checkBalance();
		currentAccount.withdraw(6000);
		currentAccount.checkBalance();

		System.out.println("\nUpdated Savings Account Balance:");
		savingsAccount.checkBalance();

		System.out.println("\nUpdated Current Account Balance:");
		currentAccount.checkBalance();
	}
}
