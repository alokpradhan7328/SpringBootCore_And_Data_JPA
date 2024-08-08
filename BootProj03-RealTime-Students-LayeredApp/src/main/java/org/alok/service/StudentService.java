package org.alok.service;

import java.util.List;

import org.alok.dao.IStudentDAO;
import org.alok.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IService 
{
	@Autowired
	private IStudentDAO dao;
	
	@Override
	public List<Student> fetchStudentInfo(String gender) throws Exception
	{
		List<Student> list = dao.getStudentInfo(gender);
		return list;
	}
}
