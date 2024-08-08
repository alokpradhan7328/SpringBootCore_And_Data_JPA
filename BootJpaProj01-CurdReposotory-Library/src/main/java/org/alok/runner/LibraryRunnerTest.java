package org.alok.runner;

import java.util.List;
import java.util.Optional;

import org.alok.entity.LibraryMgmt;
import org.alok.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunnerTest implements CommandLineRunner {

	@Autowired
	private ILibraryService service;
	
	@Override
	public void run(String... args) throws Exception {
		/*try
		 //save
		{
			LibraryMgmt lib = new LibraryMgmt(null, "EFG", "GGG", "HISTORY", 350D, 90);
			String msg = service.addBook(lib);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*try 
		 //existById()
		{
			System.out.println(service.isBookIsAvailabe(100)?"Book is Available":"Invalid Id");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		//saveAll()
		try
		{
		 LibraryMgmt book1	= new LibraryMgmt(null, "LPO", "BBB", "COMIC", 234d, 98);
		 LibraryMgmt book2	= new LibraryMgmt(null, "TRU", "CCC", "HISTORY", 657d, 76);
		 LibraryMgmt book3	= new LibraryMgmt(null, "QWE", "EEE", "BIO-GRAPHY", 329.09, 12);
		 LibraryMgmt book4	= new LibraryMgmt(null, "ASD", "FFF", "NOVEL", 912D, 25);
		 LibraryMgmt book5	= new LibraryMgmt(null, "ZXC", "HHH", "GK", 568d, 12);
		 LibraryMgmt book6	= new LibraryMgmt(null, "VBN", "JJJ", "FAMILY", 897.09, 30);
		 List list = List.of(book3,book4,book5,book6);
		 System.out.println(service.addBooks(list));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		/*
		//count()
		try
		{
			System.out.println(service.noOfBooks());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//findAll()
		try {
			 Iterable<LibraryMgmt> itr = service.showAllBooks();
			 itr.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//findByAll(Inetger id);
		try
		{
			Iterable<LibraryMgmt> showBooksById = service.showBooksById(List.of(100,120));
			showBooksById.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		//findById
		/*try
		{
		 Optional<LibraryMgmt> opt	= service.fecthBookById(1000);
		 if(opt.isPresent())
		 {
			 System.out.println("Books is available: "+opt);
		 }
		 else
		 {
			 System.err.println("Invalid Book Id ");
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		try
		{
			LibraryMgmt lib = service.fecthBookById(1000);
			System.out.println(lib);
			
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
		/*try
		{
			String msg = service.retriveBookById(1000);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*try
		{
			LibraryMgmt lib = service.displayBookById(200);
			System.out.println(lib);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*try
		 //full object modification
		{
			LibraryMgmt lib = new LibraryMgmt(100, "MMM", "NNN", "NOVEL", 657D, 78);
			System.out.println(service.addNewBook(lib));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
			//partial object modification
			try 
			{
			String msg= service.updateBook(122, 555D);
			System.out.println(msg);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}*/
		
		/*//deleteById(id)
		try 
		{
			System.out.println(service.deleteBookById(200));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		/*
		//delete(LibraryMgnt lib)
		try {
			LibraryMgmt lib = new LibraryMgmt(140, null, null, null, null, null);
			System.out.println(service.deleteBook(lib));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		/*//deleteAll()
		try {
			System.out.println(service.deleteAllBooks());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		//deleteAll(ids)
		/*
		try
		{
			System.out.println(service.deleteAllBooksById(List.of(160,161)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
	}

}
