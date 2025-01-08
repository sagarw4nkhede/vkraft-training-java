package com.vkraft.training.shoppingcartdiscount;

import java.util.Scanner;

public class ShoppingCartDiscount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of items in your cart: ");
		int numItems = scanner.nextInt();

		double totalPrice = 0;

		for (int i = 1; i <= numItems; i++) {
			System.out.print("Enter the price of item " + i + ": $");
			double itemPrice = scanner.nextDouble();
			totalPrice += itemPrice;
		}

		System.out.println("Total price before discount: $" + totalPrice);

		double finalPrice = totalPrice;
		if (totalPrice > 500) {
			finalPrice = totalPrice - (totalPrice * 0.10);
		} else if (totalPrice >= 200 && totalPrice <= 500) {
			finalPrice = totalPrice - (totalPrice * 0.05);
		}
		System.out.println("Final price after discount: $" + finalPrice);

		scanner.close();
	}
}
