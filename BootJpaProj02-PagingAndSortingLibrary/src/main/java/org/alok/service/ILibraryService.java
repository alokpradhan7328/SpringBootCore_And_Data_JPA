package org.alok.service;

import org.alok.entity.LibraryMgmt;
import org.springframework.data.domain.Page;

public interface ILibraryService 
{
	public Iterable<LibraryMgmt> dispaySoterd(boolean Order,String ...props);
	public Page<LibraryMgmt> showDataByPagination(int pageNo,int pageSize);
	public Page<LibraryMgmt> displayPagingAndSorting(int pageNo,int pageSize,boolean Order,String ...props);
}
