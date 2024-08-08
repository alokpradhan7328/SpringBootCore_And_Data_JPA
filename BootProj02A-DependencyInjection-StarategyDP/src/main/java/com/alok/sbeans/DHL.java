package com.alok.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements ICourier
{
	public DHL()
	{
		System.out.println("DHL::0-Param Constructor");
	}

	
	@Override
	public String deliver(int oid)
	{
		return oid+" order id ready to deliver using DHL courier Services ";
	}

}
