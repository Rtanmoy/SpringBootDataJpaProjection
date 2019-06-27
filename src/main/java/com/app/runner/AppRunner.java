package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.ViewA;
import com.app.repo.ProductRepository.ViewB;

@Component
public class AppRunner implements CommandLineRunner {
@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		List<Product> prod=Arrays.asList(
				 new Product(3,"AA","I","0I0",3.3),
				 new Product(4,"RR","W","4K4",4.4),
				 new Product(5,"OO","Q","1E1",5.5),
				 new Product(6,"NN","X","1O1",6.6),
				 new Product(7,"MM","Y","1A1",7.7),
				 new Product(8,"AA","T","2B2",8.8),
				 new Product(9,"FF","Z","3C3",9.9));
        repo.saveAll(prod);
        repo.findAll().forEach(System.out::println);
        
    /*    repo.findByProdCost(4.4).forEach(p->System.out.println(
        		    p.getProdCode()+"  ,  "+p.getProdId()));     */
        
        repo.findByProdCost(5.5,ViewA.class).
        forEach(p->System.out.println(p.getProdCode()));
        
        repo.findByProdCost(5.5,ViewB.class).
        forEach(p->System.out.println(p.getProdVendor()));
        
	}

}
