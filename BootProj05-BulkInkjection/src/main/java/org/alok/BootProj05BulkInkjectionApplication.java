package org.alok;

import org.alok.sbeans.College;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootProj05BulkInkjectionApplication {

	public static void main(String[] args) 
	{
		//get ioc container
	ApplicationContext ctx = SpringApplication.run(BootProj05BulkInkjectionApplication.class, args);
	//get College class obj
	College clg = ctx.getBean("clg", College.class);
	System.out.println(clg);
	}

}
