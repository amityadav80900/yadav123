package com.icl.epod.model;

import java.util.List;

public class CarrierModel {
	private List<AddressModel> addressModels;
	private String carrierCMACCode;
	private String carrierLicense;
	private Integer numberOfLicense;
	private String companyName;
	private String companyAssignedCode;
	private String faxNumber;
	private String telephoneNumber;
	private String contactFirstName;
	private String contactLastName;
	private String contactEmail;
	
	public List<AddressModel> getAddressModels() {
		return addressModels;
	}
	public void setAddressModels(List<AddressModel> addressModels) {
		this.addressModels = addressModels;
	}
	public String getCarrierCMACCode() {
		return carrierCMACCode;
	}
	public void setCarrierCMACCode(String carrierCMACCode) {
		this.carrierCMACCode = carrierCMACCode;
	}
	public String getCarrierLicense() {
		return carrierLicense;
	}
	public void setCarrierLicense(String carrierLicense) {
		this.carrierLicense = carrierLicense;
	}
	public Integer getNumberOfLicense() {
		return numberOfLicense;
	}
	public void setNumberOfLicense(Integer numberOfLicense) {
		this.numberOfLicense = numberOfLicense;
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
}
