package org.alok.runner;

import org.alok.service.IServiceMgmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PlSqlProcedureTest implements CommandLineRunner {

	@Autowired
	private IServiceMgmt service;
	
	
	@Override
	public void run(String... args) throws Exception {
		try
		{
			service.getBooksByPriceRange(500.0,1000.0).forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
