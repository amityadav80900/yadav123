package com.icl.epod.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Vijendra.y
 *
 */
@Entity
@Table(name = "vendor")
public class VendorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VENDOR_ID")
	private Integer vendorId;

	@Column(name = "DISPATCH_TERMINAL_LOCATION")
	private String dispatchTerminalLocation;

	@Column(name = "DISPATCH_TERMINAL_CD")
	private String dispatchTerminalCode;

	@OneToMany(mappedBy = "vendorEntity", cascade = CascadeType.ALL)
	private List<AddressEntity> addressEntities;

	@Column(name = "DISPATCH_TERMINAL_TELEPHONE")
	private String dispatchTerminalTelephone;

	@Column(name = "DISPATCH_TERMINAL_FAX")
	private String dispatchTerminalFax;

	@Column(name = "VENDOR")
	private String vendor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getDispatchTerminalLocation() {
		return dispatchTerminalLocation;
	}

	public void setDispatchTerminalLocation(String dispatchTerminalLocation) {
		this.dispatchTerminalLocation = dispatchTerminalLocation;
	}

	public String getDispatchTerminalCode() {
		return dispatchTerminalCode;
	}

	public void setDispatchTerminalCode(String dispatchTerminalCode) {
		this.dispatchTerminalCode = dispatchTerminalCode;
	}

	public List<AddressEntity> getAddressEntities() {
		return addressEntities;
	}

	public void setAddressEntities(List<AddressEntity> addressEntities) {
		this.addressEntities = addressEntities;
	}

	public String getDispatchTerminalTelephone() {
		return dispatchTerminalTelephone;
	}

	public void setDispatchTerminalTelephone(String dispatchTerminalTelephone) {
		this.dispatchTerminalTelephone = dispatchTerminalTelephone;
	}

	public String getDispatchTerminalFax() {
		return dispatchTerminalFax;
	}

	public void setDispatchTerminalFax(String dispatchTerminalFax) {
		this.dispatchTerminalFax = dispatchTerminalFax;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
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
