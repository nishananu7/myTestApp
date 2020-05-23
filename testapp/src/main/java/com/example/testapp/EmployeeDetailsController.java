package com.example.testapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.DTO.Employee;
import com.example.testapp.DTO.EmployeeDeptDTO;
import com.example.testapp.service.EmployeeDetailsService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
@Configuration
@ComponentScan
@RestController
public class EmployeeDetailsController {
	@Autowired
	private EmployeeDetailsService empService;
	
	@GetMapping(path="/EmployeeDeptDetails")
	public ResponseEntity<String> getEmployeeDepartmentDetail(){
		
		String responseOutput="";
		List<Employee> empList=new ArrayList<>();
		empList= empService.getEmployeeDeptDetails();
		
		Gson gson=new Gson();
		responseOutput=gson.toJson(empList);
		
		return new ResponseEntity<>(responseOutput,HttpStatus.OK);
	}
	
	

}
