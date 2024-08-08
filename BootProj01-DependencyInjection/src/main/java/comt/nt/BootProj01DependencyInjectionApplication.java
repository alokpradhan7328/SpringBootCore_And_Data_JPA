package comt.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import comt.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {

	public BootProj01DependencyInjectionApplication()
	{
		System.out.println("BootProj01DependencyInjectionApplication::0-ParamConstructor");
	}
	
	@Bean(name="ld")
	public LocalDate createDate()
	{
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Started.......");
		//get ioc container
		ApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
		//get the target spring bean class obj
		SeasonFinder sf = ctx.getBean("sf",SeasonFinder.class);
		//Invoke the bussiness method
		String res = sf.findSeason();
		System.out.println("Season Name: "+res);
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
		System.out.println("Main method Complted......");
	}

}
