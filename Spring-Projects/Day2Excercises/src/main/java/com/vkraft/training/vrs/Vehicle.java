package com.vkraft.training.vrs;

public class Vehicle {

	private String vehicleType;
	private String numberPlate;
	private double rentalPricePerDay;

	public Vehicle() {
	}

	public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
		this.vehicleType = vehicleType;
		this.numberPlate = numberPlate;
		this.rentalPricePerDay = rentalPricePerDay;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}

	private String calculateRentalCost(int rentalDays) {
		return "Total rental cost = " + (rentalDays * this.rentalPricePerDay);
	}
}
