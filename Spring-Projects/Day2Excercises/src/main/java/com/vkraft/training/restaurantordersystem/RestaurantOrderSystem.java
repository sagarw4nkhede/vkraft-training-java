package com.vkraft.training.restaurantordersystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
	private String itemName;
	private double itemPrice;
	private String itemCategory;

	// Constructor
	public MenuItem(String itemName, double itemPrice, String itemCategory) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
	}

	public String getItemName() {
		return itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void displayItem() {
		System.out.println(itemName + " - " + itemCategory + " - ₹" + itemPrice);
	}
}

class Restaurant {
	private List<MenuItem> menu;
	private List<MenuItem> orderList;

	public Restaurant() {
		this.menu = new ArrayList<>();
		this.orderList = new ArrayList<>();
		// Adding some items to the menu
		menu.add(new MenuItem("Pizza", 300.0, "Main Course"));
		menu.add(new MenuItem("Pasta", 250.0, "Main Course"));
		menu.add(new MenuItem("Burger", 150.0, "Snacks"));
		menu.add(new MenuItem("Soda", 50.0, "Drinks"));
		menu.add(new MenuItem("Ice Cream", 100.0, "Dessert"));
	}

	public void displayMenu() {
		System.out.println("Restaurant Menu:");
		for (MenuItem item : menu) {
			item.displayItem();
		}
	}

	public void takeOrder() {
		Scanner scanner = new Scanner(System.in);
		String orderInput;
		while (true) {
			System.out.println("\nEnter the item name to order (or type 'done' to finish): ");
			orderInput = scanner.nextLine();
			if (orderInput.equalsIgnoreCase("done")) {
				break;
			}
			boolean found = false;
			for (MenuItem item : menu) {
				if (item.getItemName().equalsIgnoreCase(orderInput)) {
					orderList.add(item);
					System.out.println(item.getItemName() + " added to your order.");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Item not found in the menu. Please try again.");
			}
		}
		scanner.close();
	}

	public double calculateBill() {
		double totalBill = 0.0;
		for (MenuItem item : orderList) {
			totalBill += item.getItemPrice();
		}
		return totalBill;
	}

	public void displayBill() {
		System.out.println("\nYour Orders:");
		for (MenuItem item : orderList) {
			System.out.println(item.getItemName() + " - ₹" + item.getItemPrice());
		}
		System.out.println("\nTotal Bill: ₹" + calculateBill());
	}
}

public class RestaurantOrderSystem {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();

		restaurant.displayMenu();

		restaurant.takeOrder();

		restaurant.displayBill();
	}
}
