package com.vkraft.training.eps;

public class FullTimeEmployee extends Employee {
	private double hra;
	private double da;

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(String name, int id, String designation, double basicSalary, double hra, double da) {
		super(name, id, designation, basicSalary);
		this.hra = hra;
		this.da = da;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + da + hra;
	}

	@Override
	public String toString() {
		return super.toString() + " hra=" + hra + ", da=" + da;
	}

}
