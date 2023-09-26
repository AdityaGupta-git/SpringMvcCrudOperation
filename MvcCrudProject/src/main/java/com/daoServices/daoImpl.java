package com.daoServices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.userInputValues.Product;

@Repository
public class daoImpl implements daoInterf{

	@Autowired
	HibernateTemplate template = new HibernateTemplate();
	
	@Transactional
	public void insertData(Product product) {
		// TODO Auto-generated method stub
		System.out.println("before insert");
		//int id =(Integer)this.template.save(product);
		this.template.saveOrUpdate(product);
		System.out.println("after insert");
		//return id;
	}
	
	@Transactional
	public void deleteEntry (int id) {
		Product p = this.template.load(Product.class, id);
		this.template.delete(p);
	}
	
	public List<Product> getAllData() {
		List <Product> p =this.template.loadAll(Product.class);
		return p;
	}
	
	public Product getSingleEntry(int id){	
		return this.template.get(Product.class, id);
		//return p;
	}
	
}
