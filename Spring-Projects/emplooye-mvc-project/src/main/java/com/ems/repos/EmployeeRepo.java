package com.ems.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
