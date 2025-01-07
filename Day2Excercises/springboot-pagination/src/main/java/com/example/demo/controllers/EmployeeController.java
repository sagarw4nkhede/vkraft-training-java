package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Endpoint to get paginated employees and display them in the view
	@GetMapping("/employees")
	public String getEmployeesPage(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "size", defaultValue = "5") int size, Model model) {

		Page<Employee> employees = employeeService.getEmployeesPage(page, size);

		model.addAttribute("employees", employees);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", employees.getTotalPages());
		model.addAttribute("totalItems", employees.getTotalElements());

		return "employee-list"; // Thymeleaf view name
	}
}
