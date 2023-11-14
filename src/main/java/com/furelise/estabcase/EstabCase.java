package com.furelise.estabcase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class EstabCase implements Serializable{

	private Integer estabCaseID;
	private Integer empID;
	private Integer planOrdID;
	private Date estabCaseDate;
	private Timestamp estabCaseStart;
	private Timestamp estabCaseEnd;
	private BigDecimal planPricePerCase;
	private byte[] estabCasePic;
	private byte takeStatus;
	private Integer estabCaseStatus;
	private Integer estabCaseLevel;
	private String estabCaseFeedback;
	private Timestamp estabCaseFBTime;
	
	public EstabCase() {
		
	}

	public EstabCase(Integer estabCaseID, Integer empID, Integer planOrdID, Date estabCaseDate,
			Timestamp estabCaseStart, BigDecimal planPricePerCase, Timestamp estabCaseEnd, byte[] estabCasePic,
			byte takeStatus, Integer estabCaseStatus, Integer estabCaseLevel, String estabCaseFeedback,
			Timestamp estabCaseFBTime) {
		super();
		this.estabCaseID = estabCaseID;
		this.empID = empID;
		this.planOrdID = planOrdID;
		this.estabCaseDate = estabCaseDate;
		this.estabCaseStart = estabCaseStart;
		this.planPricePerCase = planPricePerCase;
		this.estabCaseEnd = estabCaseEnd;
		this.estabCasePic = estabCasePic;
		this.takeStatus = takeStatus;
		this.estabCaseStatus = estabCaseStatus;
		this.estabCaseLevel = estabCaseLevel;
		this.estabCaseFeedback = estabCaseFeedback;
		this.estabCaseFBTime = estabCaseFBTime;
	}

	public Integer getEstabCaseID() {
		return estabCaseID;
	}

	public void setEstabCaseID(Integer estabCaseID) {
		this.estabCaseID = estabCaseID;
	}

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public Integer getPlanOrdID() {
		return planOrdID;
	}

	public void setPlanOrdID(Integer planOrdID) {
		this.planOrdID = planOrdID;
	}

	public Date getEstabCaseDate() {
		return estabCaseDate;
	}

	public void setEstabCaseDate(Date estabCaseDate) {
		this.estabCaseDate = estabCaseDate;
	}

	public Timestamp getEstabCaseStart() {
		return estabCaseStart;
	}

	public void setEstabCaseStart(Timestamp estabCaseStart) {
		this.estabCaseStart = estabCaseStart;
	}

	public BigDecimal getPlanPricePerCase() {
		return planPricePerCase;
	}

	public void setPlanPricePerCase(BigDecimal planPricePerCase) {
		this.planPricePerCase = planPricePerCase;
	}

	public Timestamp getEstabCaseEnd() {
		return estabCaseEnd;
	}

	public void setEstabCaseEnd(Timestamp estabCaseEnd) {
		this.estabCaseEnd = estabCaseEnd;
	}

	public byte[] getEstabCasePic() {
		return estabCasePic;
	}

	public void setEstabCasePic(byte[] estabCasePic) {
		this.estabCasePic = estabCasePic;
	}

	public byte getTakeStatus() {
		return takeStatus;
	}

	public void setTakeStatus(byte takeStatus) {
		this.takeStatus = takeStatus;
	}

	public Integer getEstabCaseStatus() {
		return estabCaseStatus;
	}

	public void setEstabCaseStatus(Integer estabCaseStatus) {
		this.estabCaseStatus = estabCaseStatus;
	}

	public Integer getEstabCaseLevel() {
		return estabCaseLevel;
	}

	public void setEstabCaseLevel(Integer estabCaseLevel) {
		this.estabCaseLevel = estabCaseLevel;
	}

	public String getEstabCaseFeedback() {
		return estabCaseFeedback;
	}

	public void setEstabCaseFeedback(String estabCaseFeedback) {
		this.estabCaseFeedback = estabCaseFeedback;
	}

	public Timestamp getEstabCaseFBTime() {
		return estabCaseFBTime;
	}

	public void setEstabCaseFBTime(Timestamp estabCaseFBTime) {
		this.estabCaseFBTime = estabCaseFBTime;
	}
	

}
