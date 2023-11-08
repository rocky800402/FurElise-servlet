package com.furelise.product;


import java.sql.Date;

public class Product {
	
	private Integer pID;
	private String pName;
	private Double pPrice;
	private Integer pClassID;
	private Integer pStock;
	private Boolean pStatus;
	private Date pUpload;
	private String pDetail;
	private byte[] pImage1;
	private byte[] pImage2;
	private byte[] pImage3;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer pID, String pName, Double pPrice, Integer pClassID, Integer pStock, Boolean pStatus,
			Date pUpload, String pDetail, byte[] pImage1, byte[] pImage2, byte[] pImage3) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pClassID = pClassID;
		this.pStock = pStock;
		this.pStatus = pStatus;
		this.pUpload = pUpload;
		this.pDetail = pDetail;
		this.pImage1 = pImage1;
		this.pImage2 = pImage2;
		this.pImage3 = pImage3;
	}

	public Integer getpID() {
		return pID;
	}

	public void setpID(Integer pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	public Integer getpClassID() {
		return pClassID;
	}

	public void setpClassID(Integer pClassID) {
		this.pClassID = pClassID;
	}

	public Integer getpStock() {
		return pStock;
	}

	public void setpStock(Integer pStock) {
		this.pStock = pStock;
	}

	public Boolean getpStatus() {
		return pStatus;
	}

	public void setpStatus(Boolean pStatus) {
		this.pStatus = pStatus;
	}

	public Date getpUpload() {
		return pUpload;
	}

	public void setpUpload(Date pUpload) {
		this.pUpload = pUpload;
	}

	public String getpDetail() {
		return pDetail;
	}

	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}

	public byte[] getpImage1() {
		return pImage1;
	}

	public void setpImage1(byte[] pImage1) {
		this.pImage1 = pImage1;
	}

	public byte[] getpImage2() {
		return pImage2;
	}

	public void setpImage2(byte[] pImage2) {
		this.pImage2 = pImage2;
	}

	public byte[] getpImage3() {
		return pImage3;
	}

	public void setpImage3(byte[] pImage3) {
		this.pImage3 = pImage3;
	}
	
	
	
}
