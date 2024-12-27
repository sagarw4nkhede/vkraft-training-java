package com.vkraft.training.eps;

public class EmployeePayrollSystem {

	public static void main(String[] args) {
		FullTimeEmployee employee = new FullTimeEmployee("Sagar Wankhede", 264, "Software Engineer", 10000, 3000, 4000);
		PartTimeEmployee employee2 = new PartTimeEmployee("Dhiraj Saindane", 260, "Sofwtare Engineer", 15000,100,160);

		System.out.println("Salary of " + employee.getName() + " is : " + employee.calculateSalary());
		System.out.println("Salary of " + employee2.getName() + " is : " + employee2.calculateSalary());
	}

}
