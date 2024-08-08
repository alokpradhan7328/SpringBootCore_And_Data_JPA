package comt.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ecommerce")
public class ECommercePortal {
	
	@Autowired
	@Qualifier("tx")
	private IPayment payment;

	public ECommercePortal() {
		System.out.println("ECommercePortal::0-ParamConstructor()");
	}
	//b.method
	
	public String Shopping(String items[],double prices[])
	{
		//calculate billAmt
		double billAmt=0.0;
		for(double price:prices) 
		{
		billAmt+=price;	
		}
	//use the payment system
		String txMsg = payment.doPaymetn(new Random().nextInt(100000), billAmt);
		
		if(txMsg!=null)
			return Arrays.toString(items)+"\n items having prices "+Arrays.toString(prices)+"\n having billAmount "+billAmt+"....\n"+txMsg;
		
		return Arrays.toString(items)+" items having prices "+Arrays.toString(prices)+" having billAmount "+billAmt+"...."+"PaymentFailed";
	}
}
