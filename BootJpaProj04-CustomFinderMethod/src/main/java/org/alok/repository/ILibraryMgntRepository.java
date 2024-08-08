package org.alok.repository;

import java.util.List;

import org.alok.entity.LibraryMgmt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibraryMgntRepository extends JpaRepository<LibraryMgmt, Integer> {

	public List<LibraryMgmt> findByBookName(String bookName);
	public List<LibraryMgmt> findByBookNameStartingWith(String startChar);
	public List<LibraryMgmt> getByBookNameEndingWith(String lastChar);
	public List<LibraryMgmt> readByAuthorNameIgnoreCase(String authorName);
	
	public List<LibraryMgmt> readByBookTypeContaining(String chars);
	public List<LibraryMgmt> readByPriceGreaterThanEqualAndPriceLessThanEqual(Double maxPrice,Double minPrice);
	public List<LibraryMgmt> getByBookTypeLike(String chars);
}
