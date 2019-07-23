package com.springboot.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.entity.Employee;
import com.springboot.project.repository.EmployeeRepository;

//@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/emps")
	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
