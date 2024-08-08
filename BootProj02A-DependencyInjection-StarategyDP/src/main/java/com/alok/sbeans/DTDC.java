package com.alok.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier {
	
	public DTDC() 
	{
		System.out.println("DTDC::0-Param Constructor");
	}

	@Override
	public String deliver(int oid)
	{
		
		return oid+" order id ready to deliver using DTDC courier Services ";
	}

}
