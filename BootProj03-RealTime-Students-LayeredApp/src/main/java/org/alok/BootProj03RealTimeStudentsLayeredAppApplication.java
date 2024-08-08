package org.alok;

import java.util.List;

import org.alok.controller.StudentController;
import org.alok.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj03RealTimeStudentsLayeredAppApplication {

	public static void main(String[] args) throws Exception 
	{
		//get ioc container
		ApplicationContext ctx = SpringApplication.run(BootProj03RealTimeStudentsLayeredAppApplication.class, args);
		//get sbeans class obj
		StudentController student = ctx.getBean("controller", StudentController.class);
		//invoke b method
		try
		{
			List<Student> list = student.showStudentInfo("MALE");
			list.forEach(std -> System.out.println(std));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
