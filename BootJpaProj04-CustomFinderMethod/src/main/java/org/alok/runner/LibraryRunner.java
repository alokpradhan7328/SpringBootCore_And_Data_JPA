package org.alok.runner;


import java.util.List;

import org.alok.entity.LibraryMgmt;
import org.alok.repository.ILibraryMgntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner implements CommandLineRunner {
	@Autowired
	private ILibraryMgntRepository repository;

	@Override
	public void run(String... args) throws Exception 
	{
		/*List<LibraryMgmt> list = repository.findByBookName("ZXC");
		list.forEach(book ->{
			System.out.println(book);
		});
		System.out.println(list.size()+" records are retrivied Successfully");
		*/
		
		
		//start with
		/*try
		{
		 List<LibraryMgmt> list = repository.findByBookNameStartingWith("A");
		 if (!list.isEmpty()) 
		 	{
			 list.forEach(System.out::println);
			 System.out.println(list.size()+" no of records found");	
		 	}
		 else
			 System.err.println("No record found");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		/*
		 //ending with
		try
		{
			List<LibraryMgmt> list = repository.getByBookNameEndingWith("O");
					if(!list.isEmpty())
					{
						list.forEach(System.out::println);
						System.out.println(list.size()+" no of records are founds.");
					}
					else
					{
						System.out.println("No records are found");
					}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		/*
		//IgnoreCase
		try
		{
			List<LibraryMgmt> list = repository.readByAuthorNameIgnoreCase("mmm");
			if(!list.isEmpty())
			{
				list.forEach(System.out::println);
				System.out.println(list.size()+" no of records are found");
			}
			else
				System.out.println("No records are found");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		/*//
		try
		{
			List<LibraryMgmt> list = repository.readByBookTypeContaining("A");
			if(!list.isEmpty())
			{
				list.forEach(System.out::println);
				System.out.println(list.size()+" records are found");
			}
			else
				System.out.println("No records are found");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		//repository.readByPriceGreaterThanEqualAndPriceLessThanEqual(500.0, 1000.0).forEach(System.out::println);;
		repository.getByBookTypeLike("%OV%").forEach(System.out::println);
	}
	
	

}
