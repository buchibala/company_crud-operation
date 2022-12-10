package com.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.Branch;
import com.company.model.Employee;
import com.company.repository.BranchRepository;
import com.company.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	BranchRepository branchRepository;


	public Branch addbranch(Branch branch) {
		branchRepository.save(branch);
		return branch;
		
	}
	public Employee addemp(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
	public Optional<Employee> getemp(Integer empid) {
		Optional<Employee> emp = employeeRepository.findById(empid);
		return emp;
	}

	

	
}
