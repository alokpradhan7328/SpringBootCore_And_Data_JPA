package org.alok.runner;

import java.util.List;

import org.alok.entity.StarHotel;

import org.alok.service.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IOrder order; 
	
	public TestRunner() 
	{
		System.out.println("TestRunner::0-Param Constructor");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Working");
		
		/*try {
			StarHotel hotel = new StarHotel(null,"MUSHROOM-BIRYANI","VEG",2590.90);
			String msg = order.itemsOrder(hotel);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//count()
		try
		{
			Long  num= order.items();
			System.out.println(num+" items are available.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//findAll()
		try
		{
		 Iterable<StarHotel> list= order.showAll();
		 list.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//existById
		try
		{
			System.out.println(order.itemIsAvailable(1)?"Item is available":"Item isn't available");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//findAllByIds
		try
		{
			Iterable<StarHotel> list = order.showByIds(List.of(000,102));
			list.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//saveAll()
		try
		{
			StarHotel item1= new StarHotel(null, "DOSA", "VEG", 30D);
			StarHotel item2= new StarHotel(null, "SOMASA", "VEG", 25D);
			List<StarHotel> list = List.of(item1,item2);
			System.out.println(order.itemsAdd(list));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}

}
