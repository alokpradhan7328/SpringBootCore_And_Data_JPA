package com.alok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.alok.sbeans.Flipkart;

@SpringBootApplication
@ImportResource("com/alok/cfgs/applicationContext.xml")
public class BootProj02ADependencyInjectionStarategyDpApplication 
{

	public static void main(String[] args) 
	{
		//get ioc container
		ApplicationContext ctx = SpringApplication.run(BootProj02ADependencyInjectionStarategyDpApplication.class, args);
		//get target class obj
		Flipkart flipkart = ctx.getBean("fpkt",Flipkart.class);
		//get b.method
		String result = flipkart.shopping(new String[]{"Dress","Pants","SHIRT"},new double[] {1200,3400,5600});
		System.out.println(result);
	}

}
