package org.alok.runner;


import java.util.Arrays;
import java.util.List;

import org.alok.repository.ILibraryMgntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner implements CommandLineRunner {

	@Autowired
	private ILibraryMgntRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*try
		{
			List<LibraryMgmt> list = repo.showLibrary();
			list.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/* repo.showBookInfo(200.0, 500.0).forEach(row ->{
		 	System.out.println(Arrays.toString(row));
		 });*/
		
		//System.out.println(repo.showBookPrice(164));
		
		/*Object obj =	repo.fetchBookNameAndPrice(165);
		Object data[] = (Object[])obj;*/
		/*for(Object o: data)
		{
		   System.out.println(o);
		}*/
       //System.out.println("Result is:: "+Arrays.toString(data));
       
       
       //Aggregation function 
       
		/* try
		 {
		  System.out.println(repo.uniqueBookName()); 
		 }
		 catch(Exception e)
		 {
		   e.printStackTrace();
		 }*/
       
		/*
		try
		{
		   Object res = repo.aggregationFunctions();
		   Object []data = (Object[]) res;
		   System.out.println("----Result is----");
		   System.out.println("Total No.of Books:: "+data[0]);
		   System.out.println("Maximum Price:: "+data[1]);
		   System.out.println("Minimun Price:: "+data[2]);
		   System.out.println("Average Price:: "+data[3]);
		   System.out.println("Total Price:: "+data[4]);
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
		*/
       
		
		//non-select Query
		
		
		/*
		try
		{
			int num = repo.increasePrice(10.00, 164	);
			System.out.println(num+ " records are upadte ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		
		try
		{
			int nums= repo.deleteBooks(200.0, 500.0);
			System.out.println(nums+" records are deleted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}