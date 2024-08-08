package org.alok.service;

import java.util.List;
import java.util.Optional;

import org.alok.entity.LibraryMgmt;
import org.alok.repository.ILibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("libservice")
public class LibraryServiceImpl implements ILibraryService 
{

	@Autowired
	private ILibraryRepository repo;
	
	@Override
	public String addBook(LibraryMgmt lib)  {
		System.out.println("Before save method id Value is: "+lib.getBookId());
		 LibraryMgmt libObj = repo.save(lib);
		return "Library Object is generated with Id value is: "+libObj.getBookId();
	}

	@Override
	public boolean isBookIsAvailabe(Integer id){
		boolean flag = repo.existsById(id);
		return flag;
	}
	
	@Override
	public String addBooks(List<LibraryMgmt> list)
	{
		
		Iterable<LibraryMgmt> books = repo.saveAll(list);
		return list.size()+" are added into library";
		
	}

	@Override
	public String noOfBooks(){
		
		return repo.count()+ " no of Books are available.";
	}

	@Override
	public Iterable<LibraryMgmt> showAllBooks(){
		
		return repo.findAll();
	}

	@Override
	public Iterable<LibraryMgmt> showBooksById(Iterable<Integer> ids){
		
		return repo.findAllById(ids);
	}
	
	/*@Override
	public Optional<LibraryMgmt> fecthBookById(Integer id) {
	  Optional<LibraryMgmt> opt = repo.findById(id);
	  return opt;
	}*/

	@Override
	public LibraryMgmt fecthBookById(Integer id) 
	{
		/*Optional<LibraryMgmt> opt = repo.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
		{
			throw new IllegalArgumentException("Invalid id ");
		}*/
		
		return repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invlais StockId"));
	}
	
	@Override
	public String retriveBookById(Integer id) {
		Optional<LibraryMgmt> opt = repo.findById(id);
		if(opt.isPresent())
		{
			return id+" available book is:: "+opt.get();
		}
		return id + " inalid id.";
	}
	
	@Override
	public LibraryMgmt displayBookById(Integer id) {
		LibraryMgmt lib = repo.findById(id).orElse(new LibraryMgmt(id, null, null, null, null, id));
		return lib;
	}
	
	
	@Override
	public String addNewBook(LibraryMgmt lib) {
		//loads the obj
		Optional<LibraryMgmt> opt = repo.findById(lib.getBookId());
		if(opt.isPresent())
		{
			repo.save(lib);
			return lib.getBookId()+"'s record is updated";
		}
		else
		{
			return lib.getBookId()+" new record insert into db table"+repo.save(lib);
		}
	}
	
	
	@Override
	public String updateBook(Integer id, Double newPrice) {
		//loads the object
		Optional<LibraryMgmt> opt = repo.findById(id);
		if(opt.isPresent())
		{
			LibraryMgmt lib = opt.get();
			lib.setPrice(newPrice);
			System.out.println("Update data is :: "+lib);
			return id +"'s id  book update with new price";
		}
		return id+"id not found for updatation";
	}
	
	
	@Override
	public String deleteBookById(Integer id)
	{
	//loads the object
		Optional<LibraryMgmt> opt = repo.findById(id);
		if(opt.isEmpty())
		{
			return id+" id doesn't exist for deletion";
		}
		else
		{
			repo.deleteById(id);
			return id+" id data will be deleted successfully ";
		}
	}
	
	
	@Override
	public String deleteBook(LibraryMgmt lib) 
	{
		//loads the object
		Optional<LibraryMgmt> opt = repo.findById(lib.getBookId());
		if(opt.isEmpty())
		{
			return lib.getBookId()+" id is doesn't exist for deletion";
		}
		else
		{
			repo.delete(opt.get());
			return lib.getBookId()+" id data is successfully deleted";
		}
	}
	
	
	@Override
	public String deleteAllBooks() {
		long count = repo.count();
		if(count>0)
		{
			repo.deleteAll();
			return "All recorder deleted Successfully";
		}
		return "no record found for deletion";
	}
	
	@Override
	public String deleteAllBooksById(Iterable<Integer> ids) {
		List<LibraryMgmt> list = (List<LibraryMgmt>)repo.findAllById(ids);
	  	repo.deleteAllById(ids);
		return list.size()+ " records are deleted";
	}
	
}
