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
	CREATE OR REPLACE PROCEDURE P_GET_BOOK_BY_PRICERANGE 
	(
	  STARTPRICE IN NUMBER 
	, ENDPRICE IN NUMBER 
	, DETAILS OUT SYS_REFCURSOR 
	) AS 
	BEGIN
	    open DETAILS FOR
	  SELECT * FROM ALOK_LIBRARY WHERE PRICE<=STARTPRICE AND PRICE>=ENDPRICE;
	END P_GET_BOOK_BY_PRICERANGE;
	
	*/
	
	
	@Override
	public List<LibraryMgmt> getBooksByPriceRange(Double start, Double end) {
		//create storedprocedureQuery point pl/sql procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_BOOK_BY_PRICERANGE",LibraryMgmt.class);
		//register both IN and OUT Params specifying MODE
		query.registerStoredProcedureParameter(1,Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2,Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3,Object.class,ParameterMode.REF_CURSOR);
		
		//stored values into IN params
		query.setParameter(1, start);
		query.setParameter(2, end);
		
		//execute pl/sql procedure
		List<LibraryMgmt> list= query.getResultList();
		
		return list;
	}

}
