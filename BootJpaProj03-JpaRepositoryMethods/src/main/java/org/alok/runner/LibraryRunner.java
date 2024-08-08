package org.alok.runner;

import java.util.List;
import java.util.Optional;

import org.alok.entity.LibraryMgmt;
import org.alok.service.ILibraryMgntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner implements CommandLineRunner {
	@Autowired
	private ILibraryMgntService service;

	@Override
	public void run(String... args) throws Exception {
		/*// invoke the service class method
		String res = service.deleteRecordsByIds(List.of(162,163));
		System.out.println(res);*/

		/*try
		{
			//create Example obj having enity class obj
			LibraryMgmt lib = new LibraryMgmt(null, null, null, "BIO-GRAPHY", null, null);
			//invoke the b method
			List<LibraryMgmt> list = service.showRecordsData(lib, true, "bookId","bookName");
			list.forEach(res ->{
				System.out.println(res);
			});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/

		/*
		//for checking eager loading or lazy loading findById();
		try
		{
			//Optional<LibraryMgmt> opt = service.showDataById(164);
			service.showDataById(100);
			service.showDataById(164);
			if(opt.isPresent())
			{
				System.out.println("Data:: "+opt.get());
			}
			else
			{
				System.err.println("No Record Found");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		// for checking Eager ladong & lazy loading
		/*try
		{
			 LibraryMgmt lib = service.fetchDataById(164);
			 System.out.println("proxy Class obj Name:: "+lib.getClass());
			 System.out.println("BookID::"+lib.getBookId());// till now don't hit to the db & query will n't be generated  bcoz it will take the proxy class obj/ identifier properites of proxy obj
			 System.out.println("----------------------------");
			 System.out.println("BookName:: "+lib.getBookName());
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*try
		{
			System.out.println(service.deleteDataByIds(List.of(200,203,205,204,206,207)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
	}

}
