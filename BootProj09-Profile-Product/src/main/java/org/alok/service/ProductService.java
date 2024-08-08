package org.alok.service;

import java.util.List;

import org.alok.dao.IProductDAO;
import org.alok.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
	private IProductDAO dao;
	  
	    public ProductService(IProductDAO dao) {
	        this.dao = dao;
	    }

	
	

	@Override
	public List<Product> fetchProduct(int pid) throws Exception {
		List<Product> list = dao.getProductDetails(pid);
		list.forEach(prod -> {
			double discPrice = prod.getPrice() - prod.getPrice() * 0.4;
			prod.setTotalPrice(discPrice);
		});

		return list;
	}

}
