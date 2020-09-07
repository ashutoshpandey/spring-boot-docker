package com.sprboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprboot.model.Employee;
import com.sprboot.repository.EmployeeRepository;
import com.sprboot.request.EmployeeRequest;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public String createEmployee(EmployeeRequest employeeRequest) {
		Employee employee = new Employee();
		employee.setName("Ashutosh");
		
		employeeRepository.save(employee);
		
		return "done";
	}
}
