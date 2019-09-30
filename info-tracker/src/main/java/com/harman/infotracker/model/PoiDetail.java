package com.harman.infotracker.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poiDetail")
public class PoiDetail {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "harman_id", nullable = false)
	private long harmanId;
	
	@Column(name = "poi_number", nullable = false)
	private String poiNumber;
	
	@Column(name = "poi_startdate", nullable = false)
	private Date poiStartDate;
	
	@Column(name = "poi_enddate", nullable = false)
	private Date poiEndDate;
	
	@Column(name = "poivalue", nullable = false)
	private String poiValue;
	
	
	
	public PoiDetail(long harmanId, String poiNumber, Date poiStartDate, Date poiEndDate, String poiValue) {
		super();
		//this.harmanId = harmanId;
		this.id=id;
		this.poiNumber = poiNumber;
		this.poiStartDate = poiStartDate;
		this.poiEndDate = poiEndDate;
		this.poiValue = poiValue;
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	/*public long getHarmanId() {
		return harmanId;
	}
	public void setHarmanId(long harmanId) {
		this.harmanId = harmanId;
	}*/
	public String getPoiNumber() {
		return poiNumber;
	}
	public void setPoiNumber(String poiNumber) {
		this.poiNumber = poiNumber;
	}
	public Date getPoiStartDate() {
		return poiStartDate;
	}
	public void setPoiStartDate(Date poiStartDate) {
		this.poiStartDate = poiStartDate;
	}
	public Date getPoiEndDate() {
		return poiEndDate;
	}
	public void setPoiEndDate(Date poiEndDate) {
		this.poiEndDate = poiEndDate;
	}
	public String getPoiValue() {
		return poiValue;
	}
	public void setPoiValue(String poiValue) {
		this.poiValue = poiValue;
	}
	/*@Override
	public String toString() {
		return "PoiDetail [harmanId=" + /*harmanId + ", poiNumber=" + poiNumber + ", poiStartDate=" + poiStartDate
				+ ", poiEndDate=" + poiEndDate + ", poiValue=" + poiValue + "]";
	}*/
	
	
	
	
}
