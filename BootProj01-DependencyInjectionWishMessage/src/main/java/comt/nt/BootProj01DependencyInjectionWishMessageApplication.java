package comt.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import comt.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependencyInjectionWishMessageApplication {
       @Bean(value="id")
	public LocalDateTime createldt()
	{
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
		//ioc container
		ApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionWishMessageApplication.class, args);
		//get the target bean class obj
		WishMessageGenerator message= ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String res = message.showMessage("Alok");
		System.out.println(res);
		
		//close the ioc container
		((ConfigurableApplicationContext) ctx).close();
	}

}
