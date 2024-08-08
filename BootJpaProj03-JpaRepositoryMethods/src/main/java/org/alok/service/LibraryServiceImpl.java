package org.alok.service;

import java.util.List;
import java.util.Optional;

import org.alok.entity.LibraryMgmt;
import org.alok.repository.ILibraryMgntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements ILibraryMgntService
{
	@Autowired
	private ILibraryMgntRepository repository;
	
	
	@Override
	public String deleteRecordsByIds(List<Integer> ids) {
		//store the entity class object
		 List<LibraryMgmt> list = repository.findAllById(ids);
		 if(list.size()>0)
		 {
			 repository.deleteAllByIdInBatch(ids);
				return list.size()+" records are deleted Successfully";
		 }	
		 return "No Record found";
	}
	
	@Override
	public List<LibraryMgmt> showRecordsData(LibraryMgmt lib, boolean ascOrder, String... props) {
		//Create sort obj
		Sort sort = Sort.by(ascOrder?Direction.ASC:Direction.DESC, props);
		//loads into Example obj
		Example<LibraryMgmt> example = Example.of(lib);
		//execute the method
		List<LibraryMgmt> list = repository.findAll(example, sort);
		return list;
	}
	
	//for eager loading
	@Override
	public Optional<LibraryMgmt> showDataById(Integer id) {
		return repository.findById(id);
	}
	
	//for lazy loading
	@Override
	public LibraryMgmt fetchDataById(Integer id) {
		return repository.getReferenceById(id);
	}
	
	@Override
	public String deleteDataByIds(List<Integer> ids) {
		//create lsit obj
		List<LibraryMgmt> list= repository.findAllById(ids);
		if(list.size()>0)
		{
			repository.deleteAllByIdInBatch(ids);
			return list.size()+ " records are deleted Successfully";
		}
		return "No data found";
	}
	
}
