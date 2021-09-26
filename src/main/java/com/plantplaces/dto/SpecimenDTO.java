package com.plantplaces.dto;

public class SpecimenDTO {
	
	private int specimenId;
	public int getSpecimenId() {
		return specimenId;
	}
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	private String latitude;
	private String longitude;
	private String describtion;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenId  + " " + latitude + " " + longitude + " " + describtion;
	}

}
