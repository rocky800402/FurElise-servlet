package com.furelise.ord;

import java.sql.Date;

public class Ord {
	private Integer ordID;
	private Date ordDate;
	private Integer memID;
	private Integer payment;
	private Integer deliver;
	private String address;
	private String cityCode;
	private Date deliverDate;
	private Double sum;
	private Double shipping;
	private Double total;
	private Integer saleID;
	private Integer ordStatus;
	private Date arrival;
	
	
	public Ord() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ord(Integer ordID, Date ordDate, Integer memID, Integer payment, Integer deliver,
			String address, String cityCode, Date deliverDate, Double sum, Double shipping, Double total,
			Integer saleID, Integer ordStatus, Date arrival) {
		super();
		this.ordID = ordID;
		this.ordDate = ordDate;
		this.memID = memID;
		this.payment = payment;
		this.deliver = deliver;
		this.address = address;
		this.cityCode = cityCode;
		this.deliverDate = deliverDate;
		this.sum = sum;
		this.shipping = shipping;
		this.total = total;
		this.saleID = saleID;
		this.ordStatus = ordStatus;
		this.arrival = arrival;
	}


	public Integer getOrdID() {
		return ordID;
	}


	public void setOrdID(Integer ordID) {
		this.ordID = ordID;
	}


	public Date getOrdDate() {
		return ordDate;
	}


	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}


	public Integer getMemID() {
		return memID;
	}


	public void setMemID(Integer memID) {
		this.memID = memID;
	}


	public Integer getPayment() {
		return payment;
	}


	public void setPayment(Integer payment) {
		this.payment = payment;
	}


	public Integer getDeliver() {
		return deliver;
	}


	public void setDeliver(Integer deliver) {
		this.deliver = deliver;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}


	public Date getDeliverDate() {
		return deliverDate;
	}


	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}


	public Double getSum() {
		return sum;
	}


	public void setSum(Double sum) {
		this.sum = sum;
	}


	public Double getShipping() {
		return shipping;
	}


	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Integer getSaleID() {
		return saleID;
	}


	public void setSaleID(Integer saleID) {
		this.saleID = saleID;
	}


	public Integer getOrdStatus() {
		return ordStatus;
	}


	public void setOrdStatus(Integer ordStatus) {
		this.ordStatus = ordStatus;
	}


	public Date getArrival() {
		return arrival;
	}


	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	
	
	
}
