package com.vkraft.training.eps;

public class PartTimeEmployee extends Employee {
	private double hourlyWage;
	private int hoursWorked;

	public PartTimeEmployee(String name, int id, String designation, double basicSalary, double hourlyWage,
			int hoursWorked) {
		super(name, id, designation, basicSalary);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + (hourlyWage * hoursWorked);
	}

	@Override
	public String toString() {
		return super.toString() + " hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked;
	}

}
