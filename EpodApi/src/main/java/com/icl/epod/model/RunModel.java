package com.icl.epod.model;

/**
 * @author Vijendra.y
 *
 */
public class RunModel{
	private Integer runId;
	private String customerName;
	private String status;
	private Boolean isActive;
	private Integer vehicalCountAtLoad;
	private Integer vehicalCountAtPickup;
	private Integer vehicalCountAtDelivery;
	public Integer getRunId() {
		return runId;
	}
	public void setRunId(Integer runId) {
		this.runId = runId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getVehicalCountAtLoad() {
		return vehicalCountAtLoad;
	}
	public void setVehicalCountAtLoad(Integer vehicalCountAtLoad) {
		this.vehicalCountAtLoad = vehicalCountAtLoad;
	}
	public Integer getVehicalCountAtPickup() {
		return vehicalCountAtPickup;
	}
	public void setVehicalCountAtPickup(Integer vehicalCountAtPickup) {
		this.vehicalCountAtPickup = vehicalCountAtPickup;
	}
	public Integer getVehicalCountAtDelivery() {
		return vehicalCountAtDelivery;
	}
	public void setVehicalCountAtDelivery(Integer vehicalCountAtDelivery) {
		this.vehicalCountAtDelivery = vehicalCountAtDelivery;
	}
}
