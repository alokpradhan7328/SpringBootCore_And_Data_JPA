package org.alok.repository;

import org.alok.entity.LibraryMgmt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ILibraryRepository extends PagingAndSortingRepository<LibraryMgmt, Integer> {

}
