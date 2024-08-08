package org.alok.runner;

import java.util.List;
import java.util.Optional;

import org.alok.entity.LibraryMgmt;
import org.alok.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunnerTest implements CommandLineRunner {

	@Autowired
	private ILibraryService service;
	
	
	@Override
	public void run(String... args) throws Exception
	{
		
		/*service.dispaySoterd(true, "BookName").forEach(System.out::println);
		System.out.println("------------------------------------");
		service.dispaySoterd(false, "BookId","Price").forEach(System.out::println);
		*/
		
		
	/*try
	 {
		Page<LibraryMgmt> page = service.showDataByPagination(1, 5);
		//page.forEach(System.out::println);
		System.out.println("PageNo:: "+page.getNumber());
		System.out.println("NumberOfElements:: "+page.getNumberOfElements());
		System.out.println("TotalPages:: "+page.getTotalPages());
		System.out.println("IsFirst:: "+page.isFirst());
		System.out.println("IsLast:: "+page.isLast());
		
		if(!page.isEmpty())
		{
			page.getContent().forEach(System.out::println);
		}
		else
			System.out.println("No Record Found...");
	 }
	catch(Exception e)
	 {
		e.printStackTrace();
	 }*/
	
	Page<LibraryMgmt> page = service.displayPagingAndSorting(1, 3, true, "AuthorName");
	System.out.println("PageNumber:=> "+page.getNumber());
	System.out.println("TotalPages:=> "+page.getTotalPages());
	System.out.println("IsFirst:=> "+page.isFirst());
	System.out.println("IsLast:=> "+page.isLast());
	
	if(!page.isEmpty())
	{
		page.getContent().forEach(System.out::println);
	}
	else
		System.out.println("Page Not Found.");
	}	
}
