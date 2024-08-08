package org.alok.service;

import java.util.List;
import java.util.Optional;

import org.alok.entity.LibraryMgmt;

public interface ILibraryMgntService 
{
	public String deleteRecordsByIds(List<Integer> ids);
	public List<LibraryMgmt> showRecordsData(LibraryMgmt lib,boolean ascOrder,String ...props);
	public Optional<LibraryMgmt> showDataById(Integer id);
	
	public LibraryMgmt  fetchDataById(Integer id);
	public String deleteDataByIds(List<Integer> ids);
}
