package org.alok.service;

import java.util.List;

import org.alok.model.Product;

public interface IProductService 
{
	public List<Product> fetchProduct(int pid) throws Exception;
}
