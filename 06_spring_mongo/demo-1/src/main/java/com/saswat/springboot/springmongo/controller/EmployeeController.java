package com.saswat.springboot.springmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saswat.springboot.springmongo.model.Employee;
import com.saswat.springboot.springmongo.repository.EmployeeRepository;
import com.saswat.springboot.springmongo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;

	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployee() {
		return this.service.getAllEmployee();
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return this.service.getEmployeeById(id);
	}

	@PostMapping("/saveEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.service.createEmployee(employee);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.service.updateEmployee(employee);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		this.service.deleteEmployee(id);
	}

}
