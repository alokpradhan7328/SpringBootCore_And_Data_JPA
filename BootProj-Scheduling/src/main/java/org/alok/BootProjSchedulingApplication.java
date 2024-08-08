package org.alok;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProjSchedulingApplication {

	public static void main(String[] args) 
	{
		System.out.println("BootProjSchedulingApplication.main==> start()");
		SpringApplication.run(BootProjSchedulingApplication.class, args);
		System.out.println("BootProjSchedulingApplication.main==> end()::"+new Date());
	}

}
