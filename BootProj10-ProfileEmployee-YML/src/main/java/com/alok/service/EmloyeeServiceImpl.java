package com.alok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alok.dao.IEmployeeDAO;
import com.alok.model.Employee;

@Service("empService")
public class EmloyeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO empDao;
	
	@Override
	public List<Employee> fetchAllEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		// USE DAO
		
		 List<Employee> list = empDao.getEmployeeByDesg(desg1, desg2, desg3);
		list.forEach(emp ->{
			double grossSalary=emp.getSalary()+emp.getSalary()*0.4;
			double netSalary= grossSalary-(grossSalary*0.2);
			emp.setGrossSalary(grossSalary);
			emp.setNetSalary(netSalary);
		});
		return list;
	}

}
