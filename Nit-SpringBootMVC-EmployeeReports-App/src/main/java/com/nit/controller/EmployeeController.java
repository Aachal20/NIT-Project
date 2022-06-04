package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Employee;
import com.nit.service.EmployeeMgmtService;

@Controller
//@RestController
public class EmployeeController {

	@Autowired
	private EmployeeMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		// return LVN
		return "welcome";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map, @RequestParam("type") String type) {
		// use service
		List<Employee> empsList = service.getAllEmployees();
		// add result to model attribute
		map.put("empsList", empsList);
		// return LVN based on hyperlink that is clicked
		if (type.equalsIgnoreCase("excel"))
			return "excel_report";
		else
			return "pdf_report";
	}

}
