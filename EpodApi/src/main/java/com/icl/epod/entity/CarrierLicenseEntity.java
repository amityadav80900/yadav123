package com.icl.epod.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Vijendra.y
 *
 */
@Entity
@Table(name = "carrier_license")
public class CarrierLicenseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CARRIER_LICENSE_ID")
	private Integer carrierLicenseId;

	@OneToOne(mappedBy = "carrierLicenseEntity", cascade = CascadeType.ALL)
	private CarrierEntity carrierEntity;

	@Column(name = "CARRIER_CMAC_CODE")
	private String carrierCMACCode;

	@Column(name = "CARRIER_LICENSE")
	private String carrierLicense;

	@Column(name = "NUMBER_OF_LICENSES")
	private Integer numberOfLicense;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	public Integer getCarrierLicenseId() {
		return carrierLicenseId;
	}

	public void setCarrierLicenseId(Integer carrierLicenseId) {
		this.carrierLicenseId = carrierLicenseId;
	}

	public String getCarrierCMACCode() {
		return carrierCMACCode;
	}

	public void setCarrierCMACCode(String carrierCMACCode) {
		this.carrierCMACCode = carrierCMACCode;
	}

	public Integer getNumberOfLicense() {
		return numberOfLicense;
	}

	public void setNumberOfLicense(Integer numberOfLicense) {
		this.numberOfLicense = numberOfLicense;
	}

	public String getCarrierLicense() {
		return carrierLicense;
	}

	public void setCarrierLicense(String carrierLicense) {
		this.carrierLicense = carrierLicense;
	}

	public CarrierEntity getCarrierEntity() {
		return carrierEntity;
	}

	public void setCarrierEntity(CarrierEntity carrierEntity) {
		this.carrierEntity = carrierEntity;
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
}
