package com.sprboot.service;

import java.util.List;

import com.sprboot.model.Employee;
import com.sprboot.request.EmployeeRequest;

public interface EmployeeService {
	public List<Employee> getEmployees();

	public String createEmployee(EmployeeRequest employeeRequest);
}
