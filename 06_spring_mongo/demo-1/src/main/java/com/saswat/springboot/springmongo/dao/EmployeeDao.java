package com.saswat.springboot.springmongo.dao;

import java.util.List;

import com.saswat.springboot.springmongo.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployee();

	Employee getEmployeeById(Integer id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Integer id);
}
