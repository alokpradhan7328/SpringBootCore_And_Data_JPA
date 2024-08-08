package org.alok.service;

import org.alok.entity.LibraryMgmt;
import org.alok.repository.ILibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service("libservice")
public class LibraryServiceImpl implements ILibraryService 
{
	
	@Autowired
	private ILibraryRepository repo;
	
	@Override
	public Iterable<LibraryMgmt> dispaySoterd(boolean Order, String... props) {
		//create sort object
		Sort sort = Sort.by(Order?Direction.ASC:Direction.DESC, props);
		Iterable<LibraryMgmt> sorted = repo.findAll(sort);
		return sorted;
	}
	
	@Override
	public Page<LibraryMgmt> showDataByPagination(int pageNo, int pageSize) {
		// Create pageable Object
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		//invoke method
		Page<LibraryMgmt> page = repo.findAll(pageable);
		return page;
	}
	
	@Override
	public Page<LibraryMgmt> displayPagingAndSorting(int pageNo, int pageSize, boolean Order, String... props) {
		//create sort object
		Sort sort = Sort.by(Order?Direction.ASC:Direction.DESC, props);
		
		// create pageable object
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		//invoke method
		/*Page<LibraryMgmt> page = repo.findAll(pageable);
		return page;*/
		return repo.findAll(pageable);
	}
}
