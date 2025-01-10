package com.vkraft.training.billingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " - ₹" + price;
	}
}

class CartItem {
	private Item item;
	private int quantity;

	public CartItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return item.getPrice() * quantity;
	}

	@Override
	public String toString() {
		return item.getName() + " - " + quantity + " @ ₹" + item.getPrice() + " each: ₹" + getTotalPrice();
	}
}

public class BillingSystem {
	public static void main(String[] args) {
		List<Item> storeItems = new ArrayList<>();
		storeItems.add(new Item("Rice", 50));
		storeItems.add(new Item("Sugar", 40));
		storeItems.add(new Item("Milk", 30));
		storeItems.add(new Item("Bread", 25));

		Scanner scanner = new Scanner(System.in);
		List<CartItem> cart = new ArrayList<>();

		System.out.println("Welcome to the Grocery Store!");
		System.out.println("Available items:");
		for (int i = 0; i < storeItems.size(); i++) {
			System.out.println((i + 1) + ". " + storeItems.get(i));
		}

		while (true) {
			System.out.print("\nEnter item number to add to cart (or type 0 to finish): ");
			int itemNumber = scanner.nextInt();

			if (itemNumber == 0) {
				break;
			}

			if (itemNumber < 1 || itemNumber > storeItems.size()) {
				System.out.println("Invalid item number. Please try again.");
				continue;
			}

			Item selectedItem = storeItems.get(itemNumber - 1);
			System.out.print("Enter quantity for " + selectedItem.getName() + ": ");
			int quantity = scanner.nextInt();

			cart.add(new CartItem(selectedItem, quantity));
			System.out.println(quantity + " " + selectedItem.getName() + " added to cart.");
		}

		System.out.println("\nGenerating bill...");
		double totalBill = 0;
		for (CartItem cartItem : cart) {
			System.out.println(cartItem);
			totalBill += cartItem.getTotalPrice();
		}

		System.out.println("\nTotal Bill: ₹" + totalBill);
		System.out.println("Thank you for shopping with us!");
	}
}
