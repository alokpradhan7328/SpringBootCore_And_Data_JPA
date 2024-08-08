package org.alok.controller;

import java.util.List;

import org.alok.model.Product;
import org.alok.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("prodController")
public class ProductController 
{
	public ProductController() 
	{
		System.out.println("ProductController:: 0-ParamConstructor");
	} 
	
	
	@Autowired
	private ProductService service;
	
	public List<Product> showProductInfo(int pid) throws Exception
	{
		List<Product> list = service.fetchProduct(pid);
		return  list;
	}
	
}
