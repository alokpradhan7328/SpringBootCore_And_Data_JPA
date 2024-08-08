package org.alok.repository;

import java.util.List;

import org.alok.entity.LibraryMgmt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
@Repository
public interface ILibraryMgntRepository extends JpaRepository<LibraryMgmt, Integer> 
{
	@Query("from LibraryMgmt")
	public List<LibraryMgmt> showLibrary();	
	@Query("select bookName,authorName,bookType from LibraryMgmt where price>=:min and price<=:max")
	public List<Object[]>  showBookInfo(Double min,Double max);
	@Query("select price from LibraryMgmt where bookId=?1")
	public List<Double> showBookPrice(Integer id);
	@Query("Select bookName,price from LibraryMgmt where id=?1")
	public Object fetchBookNameAndPrice(Integer id);
	
	//Aggregatin function
	@Query("select count( distinct bookName) from LibraryMgmt")
	public int uniqueBookName();	
	@Query("select count(*),max(price),min(price),avg(price),sum(price) from LibraryMgmt")
	public Object aggregationFunctions();
	
	//Non-select Query
	@Query("update LibraryMgmt set price=price+(price*:per/100.0) where bookId=:id")
	@Modifying
	@Transactional
	public int increasePrice(Double per,Integer id);
	
	@Query("delete from LibraryMgmt where price>=:min and price<=:max")
	@Modifying
	@Transactional
	public int deleteBooks(Double min,Double max);
}
