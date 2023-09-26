package com.serviceCaller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.daoServices.daoImpl;
import com.daoServices.daoInterf;
import com.userInputValues.Product;

@Service
public class ProductService {
	@Autowired
	daoInterf dao = new daoImpl();
	//daoImpl dao= new daoImpl();
	 public void inserProductDetails(Product product) {
		 System.out.println("before dao");
		 this.dao.insertData(product);
	 }
	 
	 public List<Product> allData(){
		 return this.dao.getAllData();
	 }
	 
	 public void deleteEntry(int id) {
		 this.dao.deleteEntry(id);
	 }
	 
	 public Product getSingleEntry(int id) {
		 return this.dao.getSingleEntry(id);
	 }
}
