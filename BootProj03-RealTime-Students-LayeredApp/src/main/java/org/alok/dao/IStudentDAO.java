package org.alok.dao;

import java.util.List;

import org.alok.model.Student;

public interface IStudentDAO 
{
	public List<Student> getStudentInfo(String gender1) throws Exception;
}
