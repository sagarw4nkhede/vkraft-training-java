package com.ems.sservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.models.Employee;
import com.ems.repos.EmployeeRepo;

@Service
public class EmployeeRepoService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).get();
	}

	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
		;
	}
}
