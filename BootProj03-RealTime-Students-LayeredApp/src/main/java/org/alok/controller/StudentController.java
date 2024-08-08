package org.alok.controller;

import java.util.List;

import org.alok.model.Student;
import org.alok.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("controller")
@Controller
public class StudentController 
{
	@Autowired
	private StudentService ss;
	
	public List<Student> showStudentInfo(String gender) throws Exception
	{
		List<Student> list = ss.fetchStudentInfo(gender);
		
		return list;
	}
}
