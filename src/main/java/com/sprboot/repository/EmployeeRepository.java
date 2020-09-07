package com.sprboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.sprboot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}
