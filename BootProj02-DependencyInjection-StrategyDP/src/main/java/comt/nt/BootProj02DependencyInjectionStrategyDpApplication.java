package comt.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import comt.nt.sbeans.ECommercePortal;

@SpringBootApplication
@ImportResource("comt/nt/cfgs/applicationContext.xml")
public class BootProj02DependencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		//get the ioc container
	ApplicationContext ctx = SpringApplication.run(BootProj02DependencyInjectionStrategyDpApplication.class, args);
	//get the target springbean class object
	ECommercePortal portal = ctx.getBean("ecommerce",ECommercePortal.class);
	//invoke the b method
	try
		{
		String resultMsg = portal.Shopping(new String[] {"lenin Shirt", "3/4 shorts","hat","Goggles"},
											new double[] {4500.89,5760.0,7890.05,4590.99});
		System.out.println(resultMsg);
		}//end of the try
	catch(Exception e)
	{
		e.printStackTrace();
	}
		//close the containe
		((ConfigurableApplicationContext) ctx).close();
	}
	
}
