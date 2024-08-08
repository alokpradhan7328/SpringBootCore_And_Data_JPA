package org.alok.service;

import java.util.List;

import org.alok.model.Student;

public interface IService 
{
	public List<Student> fetchStudentInfo(String gender) throws Exception;
}
