package com.saswat.springboot.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saswat.springboot.springmongo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
