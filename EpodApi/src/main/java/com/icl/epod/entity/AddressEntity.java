package com.icl.epod.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Vijendra.y
 *
 */
@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private Integer addressId;

	@Column(name = "ADDRESS_LINE1")
	private String addressLine1;

	@Column(name = "ADDRESS_LINE2")
	private String addressLine2;

	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTY")
	private String county;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "ZIP")
	private String zip;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = CarrierEntity.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "CARRIER_ID", referencedColumnName = "CARRIER_ID")
	private CarrierEntity carrierEntity;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = VendorEntity.class)
	@JoinColumn(name = "VENDOR_ID", referencedColumnName = "VENDOR_ID")
	private VendorEntity vendorEntity;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public CarrierEntity getCarrierEntity() {
		return carrierEntity;
	}

	public void setCarrierEntity(CarrierEntity carrierEntity) {
		this.carrierEntity = carrierEntity;
	}

	public VendorEntity getVendorEntity() {
		return vendorEntity;
	}

	public void setVendorEntity(VendorEntity vendorEntity) {
		this.vendorEntity = vendorEntity;
	}
}
