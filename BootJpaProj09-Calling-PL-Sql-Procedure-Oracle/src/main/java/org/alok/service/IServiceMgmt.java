package org.alok.service;

import java.util.List;

import org.alok.entity.LibraryMgmt;

public interface IServiceMgmt{
	public List<LibraryMgmt> getBooksByPriceRange(Double start,Double end);
}
