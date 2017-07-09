package com.icl.epod.model;

/**
 * @author Vijendra.y
 *
 */
public class VendorModel {
	private Integer vendorId;
	private String dispatchTerminalLocation;
	private String dispatchTerminalCode;
	private String dispatchTerminalTelephone;
	private String dispatchTerminalFax;
	private String vendor;
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
}
