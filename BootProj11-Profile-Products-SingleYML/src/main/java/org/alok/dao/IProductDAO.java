package org.alok.dao;

import java.util.List;

import org.alok.model.Product;
import org.springframework.stereotype.Repository;
@Repository
public interface IProductDAO 
{
	public List<Product> getProductDetails(int pid) throws Exception;
}
