package com.vkraft.training.eps;

public class Employee {
	private String name;
	private int id;
	private String designation;
	private double basicSalary;

	public Employee() {
	}

	public Employee(String name, int id, String designation, double basicSalary) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double calculateSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return "Employee -> name=" + name + ", id=" + id + ", designation=" + designation + ", basicSalary=" + basicSalary;
	}

}
