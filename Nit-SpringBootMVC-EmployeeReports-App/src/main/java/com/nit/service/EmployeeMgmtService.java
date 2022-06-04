package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Employee;
import com.nit.repository.EmployeeRepository;

@Service
public class EmployeeMgmtService {
	
    @Autowired
	private EmployeeRepository empRepo;
	
	 public List<Employee> getAllEmployees(){
		 
		return empRepo.findAll();
		 
	 }
}
