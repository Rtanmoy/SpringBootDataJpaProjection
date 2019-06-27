package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	<T>List<T>findByProdCost( Double prodCost,Class<T>Cls);
	
	interface ViewA{
		String getProdCode();
		String getProdModel();
	}
	interface ViewB{		
		Double getProdCost();
		String getProdVendor();
	}
/*	List<test1> findByProdCost(Double prodCost);
	List<test2> findByProdCode(String prodCode);    */
	
	
	
}
