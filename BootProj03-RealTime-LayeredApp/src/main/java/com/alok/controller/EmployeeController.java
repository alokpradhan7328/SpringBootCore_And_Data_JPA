package com.alok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alok.model.Employee;
import com.alok.service.EmloyeeServiceImpl;

@Controller("empController")
public class EmployeeController {
	@Autowired
	private EmloyeeServiceImpl service;

	public List<Employee> showAllEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		// use service
		List<Employee> aaa = service.fetchAllEmployeeByDesg(desg1, desg2, desg3);
		return aaa;
	}
}
