package org.alok.service;

import java.util.List;

import org.alok.entity.LibraryMgmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ServiceMgmtImpl implements IServiceMgmt{
	
	@Autowired
	private EntityManager manager;
	
	/*
	CREATE DEFINER=`root`@`localhost` PROCEDURE `p_get_books_byPriceRange`(in start float,
											in end float)
BEGIN
	select * from alok_library where price>=start and price<=end;
END
	
	*/
	
	
	@Override
	public List<LibraryMgmt> getBooksByPriceRange(Double start, Double end) {
		//create storedprocedureQuery point pl/sql procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("p_get_books_byPriceRange",LibraryMgmt.class);
		//register both IN and OUT Params specifying MODE
		query.registerStoredProcedureParameter(1,Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2,Double.class,ParameterMode.IN);
		
		
		//stored values into IN params
		query.setParameter(1, start);
		query.setParameter(2, end);
		
		//execute pl/sql procedure
		List<LibraryMgmt> list= query.getResultList();
		
		return list;
	}

}
