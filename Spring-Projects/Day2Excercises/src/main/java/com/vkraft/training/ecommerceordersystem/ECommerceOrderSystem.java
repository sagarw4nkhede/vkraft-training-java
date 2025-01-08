package com.vkraft.training.ecommerceordersystem;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private String customerId;
	private String name;
	private String address;

	// Constructor
	public Customer(String customerId, String name, String address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}

	// Method to display customer details
	public void displayCustomerDetails() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}
}

class OrderItem {
	private String itemName;
	private double itemPrice;

	// Constructor
	public OrderItem(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	// Method to get the item details
	public String getItemDetails() {
		return itemName + " - ₹" + itemPrice;
	}

	public double getItemPrice() {
		return itemPrice;
	}
}

class Order {
	private String orderId;
	private String orderDate;
	private List<OrderItem> orderedItems;

	// Constructor
	public Order(String orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderedItems = new ArrayList<>();
	}

	// Method to add an item to the order
	public void addItem(OrderItem item) {
		orderedItems.add(item);
	}

	// Method to calculate the total price of the order
	public double calculateTotal() {
		double total = 0;
		for (OrderItem item : orderedItems) {
			total += item.getItemPrice();
		}
		return total;
	}

	// Method to display order details
	public void displayOrderDetails() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Order Date: " + orderDate);
		System.out.println("Ordered Items:");
		for (OrderItem item : orderedItems) {
			System.out.println(item.getItemDetails());
		}
		System.out.println("Total Price: ₹" + calculateTotal());
	}
}

public class ECommerceOrderSystem {
	public static void main(String[] args) {
		// Create a customer
		Customer customer = new Customer("C12345", "Sagar Wankhede", "123 Street, City, Country");

		// Create an order
		Order order = new Order("O98765", "2025-01-08");

		// Add items to the order
		order.addItem(new OrderItem("Laptop", 50000.0));
		order.addItem(new OrderItem("Mouse", 500.0));
		order.addItem(new OrderItem("Keyboard", 1500.0));

		// Display customer details
		customer.displayCustomerDetails();
		System.out.println();

		// Display order details
		order.displayOrderDetails();
	}
}
