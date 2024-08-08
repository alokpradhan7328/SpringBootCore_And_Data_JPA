package org.alok.repository;

import org.alok.entity.LibraryMgmt;
import org.springframework.data.repository.CrudRepository;

public interface ILibraryRepository extends CrudRepository<LibraryMgmt, Integer> {

}
