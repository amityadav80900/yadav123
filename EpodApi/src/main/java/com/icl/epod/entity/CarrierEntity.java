package com.icl.epod.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author Vijendra.y
 *
 */
@Entity
@Table(name = "carrier")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "carrierId")
public class CarrierEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CARRIER_ID")
	private Integer carrierId;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "COMPANY_ASSIGNED_CD")
	private String companyAssignedCode;

	@Column(name = "FAX_NUMBER")
	private String faxNumber;

	@Column(name = "TELEPHONE_NUMBER")
	private String telephoneNumber;

	@Column(name = "CONTACT_FIRST_NAME")
	private String contactFirstName;

	@Column(name = "CONTACT_LAST_NAME")
	private String contactLastName;

	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;

	@OneToOne(targetEntity = CarrierLicenseEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CARRIER_LICENSE_ID", referencedColumnName = "CARRIER_LICENSE_ID")
	private CarrierLicenseEntity carrierLicenseEntity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@OneToMany(mappedBy = "carrierEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<AddressEntity> addressEntity;

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAssignedCode() {
		return companyAssignedCode;
	}

	public void setCompanyAssignedCode(String companyAssignedCode) {
		this.companyAssignedCode = companyAssignedCode;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public List<AddressEntity> getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(List<AddressEntity> addressEntity) {
		this.addressEntity = addressEntity;
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

	public CarrierLicenseEntity getCarrierLicenseEntity() {
		return carrierLicenseEntity;
	}

	public void setCarrierLicenseEntity(CarrierLicenseEntity carrierLicenseEntity) {
		this.carrierLicenseEntity = carrierLicenseEntity;
	}
}
