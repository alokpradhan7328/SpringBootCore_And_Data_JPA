package org.alok.service;

import java.util.List;

import org.alok.entity.EmployeeInfo;

public interface IEmployeeServiceMgmt{
	public String addEmployeeInfo(EmployeeInfo emp);
	public String addEmployies(List<EmployeeInfo> list);
	public List<EmployeeInfo> findAllEmployee();
	public List<EmployeeInfo> fetchEmployeeByDesg(String desg);
	public float fetchEmployeeAge(Integer id);
}
