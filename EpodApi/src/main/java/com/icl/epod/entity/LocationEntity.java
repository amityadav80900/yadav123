package com.icl.epod.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class LocationEntity {

	@Id
	@Column(name = "LOCATION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer locationId;

	@Column(name = "LOAD_ID")
	private Integer loadId;

	@Column(name = "LOCATION_NAME")
	private String locationName;

	@Column(name = "LOCATION_ADDRESS_ID")
	private Integer locationAddressId;

	@Column(name = "LOCATION_TYPE_ID")
	private Integer locationTypeId;

	@Column(name = "LOCATION_NOTES")
	private String locationNotes;

	@Column(name = "IS_STILL_LOCATION")
	private Boolean isSTILocation;

	@Column(name = "LOCATION_CONTACT_NAME")
	private String locationContactName;

	@Column(name = "LOCATIONCONTACTPHONE")
	private String locationContactPhone;

	@Column(name = "LOCATION_CONTACT_EMAIL")
	private String locationContactEmail;

	@Column(name = "IS_DELIVERY_LOCATION")
	private Boolean isDeliveryLocation;
	
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@Column(name = "UPDATE_DATE")
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

	public LocationEntity() {

	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
