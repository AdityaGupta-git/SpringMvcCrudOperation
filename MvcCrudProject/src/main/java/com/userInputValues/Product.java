package com.userInputValues;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String NAME;
	private String DESCRIPTION;
	private long PRICE;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public long getPRICE() {
		return PRICE;
	}
	public void setPRICE(long pRICE) {
		PRICE = pRICE;
	}
	public Product(int iD, String nAME, String dESCRIPTION, long pRICE) {
		super();
		ID = iD;
		NAME = nAME;
		DESCRIPTION = dESCRIPTION;
		PRICE = pRICE;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION + ", PRICE=" + PRICE + "]";
	}

	
	
}
