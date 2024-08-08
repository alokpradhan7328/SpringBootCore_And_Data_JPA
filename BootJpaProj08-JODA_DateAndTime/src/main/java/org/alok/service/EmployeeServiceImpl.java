package org.alok.service;

import java.util.List;

import org.alok.entity.EmployeeInfo;
import org.alok.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements IEmployeeServiceMgmt {

	@Autowired
	private IEmployeeRepository employeeRepo;
	
	@Override
	public String addEmployeeInfo(EmployeeInfo emp) {
		int eid = employeeRepo.save(emp).getEid();
		return "EMployee Object is added having eid: "+eid;
	}
	
	@Override
	public String addEmployies(List<EmployeeInfo> list) {
		 employeeRepo.saveAll(list);
		return list.size()+ " no. of Employee added Successfully";
	}
	
	@Override
	public List<EmployeeInfo> findAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public List<EmployeeInfo> fetchEmployeeByDesg(String desg) {
		return employeeRepo.getEmlployeeByDesg(desg);
	}
	
	@Override
	public float fetchEmployeeAge(Integer id) {
		return employeeRepo.getEmployeeByID(id);
	}
}
