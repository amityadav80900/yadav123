package com.icl.epod.model;

/**
 * @author Vijendra.y
 *
 */
public class DamageAreaCodeModel {
	private Integer damageAreaId;
	private String damageAreaDesc;
	private DamageDetailModel damageDetailModel;
	private ColorModel color;
	private VehicleSegmentModel velicleSegmentModel;
	private DamageCodeModel damageCodeModel;
	public Integer getDamageAreaId() {
		return damageAreaId;
	}
	public void setDamageAreaId(Integer damageAreaId) {
		this.damageAreaId = damageAreaId;
	}
	public String getDamageAreaDesc() {
		return damageAreaDesc;
	}
	public void setDamageAreaDesc(String damageAreaDesc) {
		this.damageAreaDesc = damageAreaDesc;
	}
	public DamageDetailModel getDamageDetailModel() {
		return damageDetailModel;
	}
	public void setDamageDetailModel(DamageDetailModel damageDetailModel) {
		this.damageDetailModel = damageDetailModel;
	}
	public ColorModel getColor() {
		return color;
	}
	public void setColor(ColorModel color) {
		this.color = color;
	}
	public VehicleSegmentModel getVelicleSegmentModel() {
		return velicleSegmentModel;
	}
	public void setVelicleSegmentModel(VehicleSegmentModel velicleSegmentModel) {
		this.velicleSegmentModel = velicleSegmentModel;
	}
	public DamageCodeModel getDamageCodeModel() {
		return damageCodeModel;
	}
	public void setDamageCodeModel(DamageCodeModel damageCodeModel) {
		this.damageCodeModel = damageCodeModel;
	}	
}
