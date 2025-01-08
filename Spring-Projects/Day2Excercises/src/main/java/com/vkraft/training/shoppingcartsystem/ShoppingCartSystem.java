package com.vkraft.training.shoppingcartsystem;

import java.util.ArrayList;
import java.util.List;

class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return price * quantity;
	}
}

class Cart {
	private List<Product> products;

	public Cart() {
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		for (Product p : products) {
			if (p.getName().equals(product.getName())) {
				// If the product exists, update its quantity
				p.setQuantity(p.getQuantity() + product.getQuantity());
				return;
			}
		}
		// If the product does not exist, add it to the cart
		products.add(product);
	}

	public void removeProduct(String productName) {
		products.removeIf(p -> p.getName().equals(productName));
	}

	public double calculateTotal() {
		double total = 0.0;
		for (Product product : products) {
			total += product.getTotalPrice();
		}
		return total;
	}

	public void displayCart() {
		if (products.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			System.out.println("Cart Details:");
			for (Product product : products) {
				System.out.println(product.getName() + " - Quantity: " + product.getQuantity() + " - Total: ₹"
						+ product.getTotalPrice());
			}
		}
	}
}

public class ShoppingCartSystem {
	public static void main(String[] args) {
		Cart cart = new Cart();

		Product product1 = new Product("Laptop", 1000.0, 1);
		Product product2 = new Product("Phone", 500.0, 2);
		Product product3 = new Product("Headphones", 50.0, 3);

		cart.addProduct(product1);
		cart.addProduct(product2);
		cart.addProduct(product3);

		cart.displayCart();
		System.out.println("Total price: ₹" + cart.calculateTotal());

		cart.removeProduct("Phone");

		System.out.println("\nAfter removing Phone:");
		cart.displayCart();

		System.out.println("Total price: ₹" + cart.calculateTotal());
	}
}
