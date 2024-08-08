package com.alok.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart 
{
	public Flipkart()
	{
		System.out.println("Flipkart::0-Param Constructor");
	}
	
	@Qualifier("dhl")
	
	//has a Property
	@Autowired	//field injection
	private ICourier courier;
	
	//b.method
	public String shopping(String items[],double prices[])
	{
		double billAmt =0;
		for( double price:prices)
		{
			billAmt+=price;
		}
		
		//generate random order id
		int oid = new Random().nextInt(1000);
		
		//get the courier msg
		String courierMsg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchase having prices "+Arrays.toString(prices) +" bill Amount Rs. $$ "+billAmt+" Rupees only/-  ---->"+courierMsg;
	}
	
}
