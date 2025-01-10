package com.vkraft.training.restaurantmenuordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
	private String name;
	private double price;

	public MenuItem(String name, double price) {
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

class OrderItem {
	private MenuItem menuItem;
	private int quantity;

	public OrderItem(MenuItem menuItem, int quantity) {
		this.menuItem = menuItem;
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return menuItem.getPrice() * quantity;
	}

	@Override
	public String toString() {
		return menuItem.getName() + " - " + quantity + " @ ₹" + menuItem.getPrice() + " each: ₹" + getTotalPrice();
	}
}

public class RestaurantMenuOrdering {
	public static void main(String[] args) {
		List<MenuItem> menu = new ArrayList<>();
		menu.add(new MenuItem("Pizza", 250));
		menu.add(new MenuItem("Burger", 150));
		menu.add(new MenuItem("Pasta", 200));
		menu.add(new MenuItem("Coffee", 100));

		Scanner scanner = new Scanner(System.in);
		List<OrderItem> order = new ArrayList<>();

		System.out.println("Welcome to the Restaurant!");
		System.out.println("Menu:");
		for (int i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + ". " + menu.get(i));
		}

		while (true) {
			System.out.print("\nEnter menu item number to order (or type 0 to finish): ");
			int menuItemNumber = scanner.nextInt();

			if (menuItemNumber == 0) {
				break;
			}

			if (menuItemNumber < 1 || menuItemNumber > menu.size()) {
				System.out.println("Invalid menu item number. Please try again.");
				continue;
			}

			MenuItem selectedItem = menu.get(menuItemNumber - 1);
			System.out.print("Enter quantity for " + selectedItem.getName() + ": ");
			int quantity = scanner.nextInt();

			order.add(new OrderItem(selectedItem, quantity));
			System.out.println(quantity + " " + selectedItem.getName() + " added to order.");
		}

		System.out.println("\nGenerating bill...");
		double totalBill = 0;
		for (OrderItem orderItem : order) {
			System.out.println(orderItem);
			totalBill += orderItem.getTotalPrice();
		}

		System.out.println("\nTotal Bill: ₹" + totalBill);
		System.out.println("Thank you for dining with us!");
	}
}
