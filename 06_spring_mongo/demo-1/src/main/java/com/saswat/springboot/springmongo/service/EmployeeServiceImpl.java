package com.saswat.springboot.springmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.saswat.springboot.springmongo.dao.EmployeeDaoImpl;
import com.saswat.springboot.springmongo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDaoImpl dao;

	public List<Employee> getAllEmployee() {
		return this.dao.getAllEmployee();
	}

	public Employee getEmployeeById(Integer id) {
		return this.dao.getEmployeeById(id);
	}

	public Employee createEmployee(Employee employee) {
		return this.dao.createEmployee(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return this.dao.updateEmployee(employee);
	}

	public void deleteEmployee(Integer id) {
		this.dao.deleteEmployee(id);
	}
}
