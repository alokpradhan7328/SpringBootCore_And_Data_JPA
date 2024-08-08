package org.alok.service;

import java.util.List;

import org.alok.entity.LibraryMgmt;

public interface ILibraryService 
{
	public String addBook(LibraryMgmt lib);
	public boolean isBookIsAvailabe(Integer id);
	public String addBooks(List<LibraryMgmt> list) ;
	public String noOfBooks();
	public Iterable<LibraryMgmt> showAllBooks();
	public Iterable<LibraryMgmt> showBooksById(Iterable<Integer> ids);
	public LibraryMgmt fecthBookById(Integer id);
	public String retriveBookById(Integer id);
	public LibraryMgmt displayBookById(Integer id);
	public String addNewBook(LibraryMgmt lib);
	public String updateBook(Integer id,Double newPrice);
	public String deleteBookById(Integer id);
	public String deleteBook(LibraryMgmt lib);
	public String deleteAllBooks();
	public String deleteAllBooksById(Iterable<Integer> list);
}
