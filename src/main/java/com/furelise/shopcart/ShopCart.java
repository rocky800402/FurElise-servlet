package com.furelise.shopcart;

public class ShopCart {
	private Integer memID;
	private Integer pID;
	
	public ShopCart() {
		super();
		
	}

	public ShopCart(Integer memID, Integer pID) {
		super();
		this.memID = memID;
		this.pID = pID;
	}

	public Integer getMemID() {
		return memID;
	}

	public void setMemID(Integer memID) {
		this.memID = memID;
	}

	public Integer getpID() {
		return pID;
	}

	public void setpID(Integer pID) {
		this.pID = pID;
	}
	
	
}
