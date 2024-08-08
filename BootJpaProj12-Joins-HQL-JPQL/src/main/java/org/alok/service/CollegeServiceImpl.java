package org.alok.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.alok.entity.College;
import org.alok.entity.Student;
import org.alok.repository.ICollegeRepository;
import org.alok.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl  implements ICollegeService 
{
	@Autowired
	private ICollegeRepository collegeRepo;
	
	@Autowired
	private IStudentRepository studentRepo;
	
	@Override
	public List<Object[]> getDataUsingParent() {
		return collegeRepo.fetchDataUsingParent();
	}
	
    @Override
	public List<Object[]> getDataUsingChild() {
		return studentRepo.fetchDataUsingChild();
	}
	
}
