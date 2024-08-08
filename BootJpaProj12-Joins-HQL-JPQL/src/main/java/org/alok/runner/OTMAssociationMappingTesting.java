package org.alok.runner;

import java.util.Arrays;

import org.alok.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OTMAssociationMappingTesting implements CommandLineRunner {

	@Autowired
	private ICollegeService collegeService;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*	collegeService.getDataUsingParent().forEach(std ->{
				System.out.println(Arrays.toString(std));
			});*/
		
		collegeService.getDataUsingChild().forEach(clg ->{
			System.out.println(Arrays.toString(clg));
		});
	}

}
