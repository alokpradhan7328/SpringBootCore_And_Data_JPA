package com.alok;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.alok.controller.EmployeeController;
import com.alok.model.Employee;

@SpringBootApplication
public class BootProj03Profile {

	public static void main(String[] args) {
		// get IoC container
		ApplicationContext ctx = SpringApplication.run(BootProj03Profile.class, args);

		// get Controller Class object reference
		EmployeeController control = ctx.getBean("empController", EmployeeController.class);

		// invoke the method
		try {
			List<Employee> list = control.showAllEmployeeByDesg("CLERK", "SALESMAN", "MANAGER");
			list.forEach(emp -> {
				System.out.println(emp);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) ctx).close();
	}
}
