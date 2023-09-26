package com.daoServices;

import java.util.List;

import com.userInputValues.Product;

public interface daoInterf {
 public void insertData(Product product);
 public List<Product> getAllData() ;
 public void deleteEntry(int id);
 public Product getSingleEntry(int id);
}
