package com.alok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.alok.sbeans.Journey;

@SpringBootApplication
public class BootProj04DataInjectionSpelApplication {

	public static void main(String[] args)
	{
		//get the ioc container
		ApplicationContext ctx = SpringApplication.run(BootProj04DataInjectionSpelApplication.class, args);
		//get JournerClass obj
		Journey journey = ctx.getBean("journey", Journey.class);
		//invoke the b method
		System.out.println(journey);
		
		//close the ioc container
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
