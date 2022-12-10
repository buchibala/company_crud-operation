package com.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Branch;
import com.company.model.Employee;
import com.company.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/addbranch")
	Branch addbranch(@RequestBody Branch branch) {
		employeeService.addbranch(branch);
		return  branch;	
	}
	@PostMapping("/addemployee")
	Employee addemp(@RequestBody Employee employee) {
		employeeService.addemp(employee);
		return employee;
		
	}
	@GetMapping("/getemployee")
	Optional<Employee> getemp(@RequestParam Integer empid) {
		Optional<Employee> employee = employeeService.getemp(empid);
		return employee;
		
	}
	

}
