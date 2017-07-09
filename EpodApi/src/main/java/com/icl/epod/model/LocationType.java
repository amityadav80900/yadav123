package com.icl.epod.model;

/**
 * @author Vijendra.y
 *
 */
public class LocationType {
	private Integer locationTypeId;
	private String locationTypeName;
	private Boolean isPickUpOnly;
	private Boolean isDeliveryOnly;
	public Integer getLocationTypeId() {
		return locationTypeId;
	}
	public void setLocationTypeId(Integer locationTypeId) {
		this.locationTypeId = locationTypeId;
	}
	public String getLocationTypeName() {
		return locationTypeName;
	}
	public void setLocationTypeName(String locationTypeName) {
		this.locationTypeName = locationTypeName;
	}
	public Boolean getIsPickUpOnly() {
		return isPickUpOnly;
	}
	public void setIsPickUpOnly(Boolean isPickUpOnly) {
		this.isPickUpOnly = isPickUpOnly;
	}
	public Boolean getIsDeliveryOnly() {
		return isDeliveryOnly;
	}
	public void setIsDeliveryOnly(Boolean isDeliveryOnly) {
		this.isDeliveryOnly = isDeliveryOnly;
	}	
}

