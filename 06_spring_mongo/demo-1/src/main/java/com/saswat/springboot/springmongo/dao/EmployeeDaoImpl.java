package com.saswat.springboot.springmongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.saswat.springboot.springmongo.model.Employee;
import com.saswat.springboot.springmongo.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		return this.employeeRepository.findById(id).get();
	}

	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	public void deleteEmployee(Integer id) {
		this.employeeRepository.deleteById(id);
	}
}
