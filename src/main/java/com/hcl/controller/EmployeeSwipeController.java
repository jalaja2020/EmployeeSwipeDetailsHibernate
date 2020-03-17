package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeSwipeService;

@RestController
@RequestMapping("/EmployeeSwipe")
public class EmployeeSwipeController {
	
	@Autowired
	EmployeeSwipeService employeeSwipeService;

	@PostMapping
	public ResponseEntity<String>  addEmployeeSwipeDetails(@RequestBody Employee employee) {
		int employeeSwipeSuccess = employeeSwipeService.SaveEmployeeSwipeDetails(employee);
		return new ResponseEntity<>("Employee swipe details saved Successfully :"+employeeSwipeSuccess,HttpStatus.OK);
	}
}
