package com.vkraft.training.temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Temperature Converter");
		System.out.println("Select the conversion direction:");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.print("Enter your choice (1 or 2): ");
		int choice = scanner.nextInt();

		System.out.print("Enter the temperature value: ");
		double temperature = scanner.nextDouble();

		double convertedTemperature;
		switch (choice) {
		case 1:
			convertedTemperature = (temperature * 9 / 5) + 32;
			System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
			break;
		case 2:
			convertedTemperature = (temperature - 32) * 5 / 9;
			System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
			break;
		default:
			System.out.println("Invalid choice. Please select 1 or 2.");
			break;
		}

		scanner.close();
	}
}
