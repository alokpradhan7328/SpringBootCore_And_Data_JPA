package org.alok.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.alok.entity.EmployeeInfo;
import org.alok.service.IEmployeeServiceMgmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JodaLocalDateAndTime implements CommandLineRunner {
	
	@Autowired
	private IEmployeeServiceMgmt employeeService;
	
	@Override
	public void run(String... args) throws Exception {
		/*try
		{
			EmployeeInfo emp = new EmployeeInfo("Alok", "Hyd","JavaDeveloper", LocalDateTime.of(2001,9,11,06,30) , LocalTime.of(11, 25), LocalDate.of(2024, 9, 18));
			String msg= employeeService.addEmployeeInfo(emp);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*try
		{
			EmployeeInfo e1 = new EmployeeInfo("Aditya", "Berhampur", "Oracle", LocalDateTime.of(2001,02,10,03,45), LocalTime.of(10, 20), LocalDate.of(2023, 03, 7));
			EmployeeInfo e2 = new EmployeeInfo("Deepak", "Surat", "Tester", LocalDateTime.of(2002,03,1,06,12), LocalTime.of(10, 55), LocalDate.of(2024, 12, 31));
			EmployeeInfo e3 = new EmployeeInfo("Satya", "Bangalore", "Python", LocalDateTime.of(2001,12,25,20,25), LocalTime.of(2, 15), LocalDate.of(2024, 8, 16));
			EmployeeInfo e4 = new EmployeeInfo("Durga", "Delhi", "UI", LocalDateTime.of(2004,04,01,8,12), LocalTime.of(12, 00), LocalDate.of(2025, 03, 7));
			
		String res = employeeService.addEmployies(List.of(e1,e2,e3,e4));
		System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/

		/*
		try
		{
			employeeService.findAllEmployee().forEach(emp ->{
				System.out.println(emp);
			});;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}*/
		
		/*
		try
		{
		employeeService.fetchEmployeeByDesg("JavaDeveloper").forEach(emp ->{
			System.out.println(emp);
		});	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		try {
			float age= employeeService.fetchEmployeeAge(1000);
			System.out.println("Age of the Employee is: "+age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
