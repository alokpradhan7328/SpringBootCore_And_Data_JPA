package org.alok;

import org.alok.sbeans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootProj06YmlYamlApplication 
{

	public static void main(String[] args)
	{
		//get ioc container
	ApplicationContext ctx = SpringApplication.run(BootProj06YmlYamlApplication.class, args);
	//get Sprigbeans Class obj
	Employee emp = ctx.getBean("emp",Employee.class);
	System.out.println(emp);
	}

}
