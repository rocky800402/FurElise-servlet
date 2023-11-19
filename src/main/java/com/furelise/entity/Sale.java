package com.furelise.entity;

import java.sql.Date;

public class Sale {
	private Integer saleID;
	private String coupon;
	private Date saleStart;
	private Date saleEnd;
	private Double disRequire;
	private Double dis;

	public Sale() {
		super();
	}

	public Sale(Integer saleID, String coupon, Date saleStart, Date saleEnd, Double disRequire, Double dis) {
		super();
		this.saleID = saleID;
		this.coupon = coupon;
		this.saleStart = saleStart;
		this.saleEnd = saleEnd;
		this.disRequire = disRequire;
		this.dis = dis;
	}
	
	public Integer getSaleID() {
		return saleID;
	}


	public void setSaleID(Integer saleID) {
		this.saleID = saleID;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public Date getSaleStart() {
		return saleStart;
	}

	public void setSaleStart(Date saleStart) {
		this.saleStart = saleStart;
	}

	public Date getSaleEnd() {
		return saleEnd;
	}

	public void setSaleEnd(Date saleEnd) {
		this.saleEnd = saleEnd;
	}

	public Double getDisRequire() {
		return disRequire;
	}

	public void setDisRequire(Double disRequire) {
		this.disRequire = disRequire;
	}

	public Double getDis() {
		return dis;
	}

	public void setDis(Double dis) {
		this.dis = dis;
	}

}
