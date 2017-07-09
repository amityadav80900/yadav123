package com.icl.epod.model;

import java.util.Date;

/**
 * @author Vijendra.y
 *
 */
public class LocationModel
{
	private Integer locationId;
	
	private Integer loadId;
	
	private String locationName;
	
	private Integer locationAddressId;
	
	private Integer locationTypeId;
	
	private String locationNotes;
	
	private Boolean isSTILocation;
	
	private String locationContactName;
	
	private String locationContactPhone;
	
	private String locationContactEmail;
	
	private Boolean isDeliveryLocation;
	
	private Date createDate;
	
	private Date updateDate;

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getLoadId() {
		return loadId;
	}

	public void setLoadId(Integer loadId) {
		this.loadId = loadId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Integer getLocationAddressId() {
		return locationAddressId;
	}

	public void setLocationAddressId(Integer locationAddressId) {
		this.locationAddressId = locationAddressId;
	}

	public Integer getLocationTypeId() {
		return locationTypeId;
	}

	public void setLocationTypeId(Integer locationTypeId) {
		this.locationTypeId = locationTypeId;
	}

	public String getLocationNotes() {
		return locationNotes;
	}

	public void setLocationNotes(String locationNotes) {
		this.locationNotes = locationNotes;
	}

	public Boolean getIsSTILocation() {
		return isSTILocation;
	}

	public void setIsSTILocation(Boolean isSTILocation) {
		this.isSTILocation = isSTILocation;
	}

	public String getLocationContactName() {
		return locationContactName;
	}

	public void setLocationContactName(String locationContactName) {
		this.locationContactName = locationContactName;
	}

	public String getLocationContactPhone() {
		return locationContactPhone;
	}

	public void setLocationContactPhone(String locationContactPhone) {
		this.locationContactPhone = locationContactPhone;
	}

	public String getLocationContactEmail() {
		return locationContactEmail;
	}

	public void setLocationContactEmail(String locationContactEmail) {
		this.locationContactEmail = locationContactEmail;
	}

	public Boolean getIsDeliveryLocation() {
		return isDeliveryLocation;
	}

	public void setIsDeliveryLocation(Boolean isDeliveryLocation) {
		this.isDeliveryLocation = isDeliveryLocation;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public LocationModel() {

	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
