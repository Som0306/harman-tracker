package com.harman.infotracker.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poiDetail")
public class PoiDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "harman_id", nullable = false)
	private long harmanId;
	
	@Column(name = "poi_number", nullable = false)
	private String poiNumber;
	
	@Column(name = "poi_startdate", nullable = false)
	private String poiStartDate;
	
	@Column(name = "poi_enddate", nullable = false)
	private String poiEndDate;
	
	@Column(name = "poivalue", nullable = false)
	private String poiValue;
	
	public PoiDetail() {
		// TODO Auto-generated constructor stub
	}
	
	public PoiDetail(long harmanId, String poiNumber, String poiStartDate, String poiEndDate, String poiValue) {
		super();
		this.harmanId = harmanId;
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


	public long getHarmanId() {
		return harmanId;
	}
	public void setHarmanId(long harmanId) {
		this.harmanId = harmanId;
	}
	public String getPoiNumber() {
		return poiNumber;
	}
	public void setPoiNumber(String poiNumber) {
		this.poiNumber = poiNumber;
	}
	public String getPoiStartDate() {
		return poiStartDate;
	}
	public void setPoiStartDate(String poiStartDate) {
		this.poiStartDate = poiStartDate;
	}
	public String getPoiEndDate() {
		return poiEndDate;
	}
	public void setPoiEndDate(String poiEndDate) {
		this.poiEndDate = poiEndDate;
	}
	public String getPoiValue() {
		return poiValue;
	}
	public void setPoiValue(String poiValue) {
		this.poiValue = poiValue;
	}
	
	@Override
	public String toString() {
		return "PoiDetail [harmanId=" + harmanId + ", poiNumber=" + poiNumber + ", poiStartDate=" + poiStartDate
				+ ", poiEndDate=" + poiEndDate + ", poiValue=" + poiValue + "]";
	}
	
	
	
	
}
