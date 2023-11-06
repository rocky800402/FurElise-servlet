package com.furelise.productclass;

import java.io.Serializable;

public class ProductClass implements Serializable{
	
	private Integer pClassID;
	private String pClassName;
	
	public ProductClass() {
		
	}

	public ProductClass(Integer pClassID, String pClassName) {
		super();
		this.pClassID = pClassID;
		this.pClassName = pClassName;
	}

	public Integer getpClassID() {
		return pClassID;
	}

	public void setpClassID(Integer pClassID) {
		this.pClassID = pClassID;
	}

	public String getpClassName() {
		return pClassName;
	}

	public void setpClassName(String pClassName) {
		this.pClassName = pClassName;
	}
	
	
}