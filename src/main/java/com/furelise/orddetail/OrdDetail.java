package com.furelise.orddetail;

import java.sql.Date;

public class OrdDetail {
	
	private Integer ordID;
	private Integer pID;
	private Integer detaQty;
	private String feedback;
	private Integer level;
	private Date fbTime;
	
	public OrdDetail() {
		super();
	}

	public OrdDetail( Integer ordID, Integer pID, Integer detaQty, Double pPrice, String feedback,
			Integer level, Date fbTime) {
		super();
		
		this.ordID = ordID;
		this.pID = pID;
		this.detaQty = detaQty;
		this.feedback = feedback;
		this.level = level;
		this.fbTime = fbTime;
	}


	public Integer getOrdID() {
		return ordID;
	}

	public void setOrdID(Integer ordID) {
		this.ordID = ordID;
	}

	public Integer getpID() {
		return pID;
	}

	public void setpID(Integer pID) {
		this.pID = pID;
	}

	public Integer getDetaQty() {
		return detaQty;
	}

	public void setDetaQty(Integer detaQty) {
		this.detaQty = detaQty;
	}


	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Date getFbTime() {
		return fbTime;
	}

	public void setFbTime(Date fbTime) {
		this.fbTime = fbTime;
	}

}
