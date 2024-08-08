package com.alok.sbeans;

import org.springframework.stereotype.Component;

@Component("bluedart")
public class BlueDart implements ICourier
{
	public BlueDart() 
	{
		System.out.println("BlueDart::0-Param Constructor");
	}
	@Override
	public String deliver(int oid) 
	{
		return oid+" order id ready to deliver using BlueDart courier Services ";
	}

}
