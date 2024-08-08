package com.alok.service;

import java.util.List;

import com.alok.model.Employee;

public interface IEmployeeService {
	public List<Employee> fetchAllEmployeeByDesg(String desg1,String desg2,String desg3) throws Exception;
}
