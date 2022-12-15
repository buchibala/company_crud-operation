package com.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.dao.Empdetails;

import com.company.model.Employee;
import com.company.repository.BranchRepository;
import com.company.repository.EmployeeRepository;


@RestController
public class EmployeeController {
	@Autowired
	BranchRepository branchRepository;
	@Autowired
	EmployeeRepository employeeRepository;
		
	@PostMapping("/addemp")
		public Employee addemp(@RequestBody Empdetails emp) {
			return employeeRepository.save(emp.getEmployee());
			
		}
	@GetMapping("/getemp")
	public List<Employee> getemp(){
		return employeeRepository.findAll();
		
	}
	}

