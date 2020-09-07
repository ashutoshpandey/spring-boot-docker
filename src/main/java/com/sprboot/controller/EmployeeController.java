package com.sprboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprboot.model.Employee;
import com.sprboot.request.EmployeeRequest;
import com.sprboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@PostMapping("/employees")
	public String createEmployee(EmployeeRequest employeeRequest){
		return employeeService.createEmployee(employeeRequest);
	}
}
