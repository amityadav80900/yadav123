package com.icl.epod.util;

import java.util.Date;
import java.util.HashSet;

import javax.xml.ws.Service.Mode;

import org.springframework.stereotype.Component;

import com.icl.epod.entity.AddressEntity;
import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.CarrierLicenseEntity;
import com.icl.epod.entity.LocationEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.entity.UserRoleEntity;
import com.icl.epod.entity.VendorEntity;
import com.icl.epod.model.AddressModel;
import com.icl.epod.model.CarrierModel;
import com.icl.epod.model.LocationModel;
import com.icl.epod.model.UserModel;
import com.icl.epod.model.UserRoleModel;
import com.icl.epod.model.VendorModel;

/**
 * @author Vijendra.y
 *
 */
@Component
public class CommonUtils {

	/**
	 * This method will convert CarrierModel To CarrierEntity.
	 *
	 */
	public CarrierEntity carrierModeToEntity(CarrierModel model, CarrierEntity entity) {
		if (model.getCompanyName() != null) {
			entity.setCompanyName(model.getCompanyName());
		}
		if (model.getCompanyAssignedCode() != null) {
			entity.setCompanyAssignedCode(model.getCompanyAssignedCode());
		}
		if (model.getFaxNumber() != null) {
			entity.setFaxNumber(model.getFaxNumber());
		}
		if (model.getTelephoneNumber() != null) {
			entity.setTelephoneNumber(model.getTelephoneNumber());
		}
		if (model.getContactFirstName() != null) {
			entity.setContactFirstName(model.getContactFirstName());
		}
		if (model.getContactLastName() != null) {
			entity.setContactLastName(model.getContactLastName());
		}
		if (model.getContactEmail() != null) {
			entity.setContactEmail(model.getContactEmail());
		}
		return entity;
	}

	/**
	 * This method will convert AddressModel To AddressEntity.
	 *
	 */
	public AddressEntity addressrModeToEntity(AddressModel model, AddressEntity entity) {
		if (model.getAddressLine1() != null) {
			entity.setAddressLine1(model.getAddressLine1());
		}
		if (model.getAddressLine2() != null) {
			entity.setAddressLine2(model.getAddressLine2());
		}
		if (model.getCity() != null) {
			entity.setCity(model.getCity());
		}
		if (model.getCounty() != null) {
			entity.setCounty(model.getCounty());
		}
		if (model.getState() != null) {
			entity.setState(model.getState());
		}
		if (model.getCountry() != null) {
			entity.setCountry(model.getCountry());
		}
		if (model.getZip() != null) {
			entity.setZip(model.getZip());
		}
		return entity;
	}

	/**
	 * This method will convert CarrierLicenseModel To CarrierLicenseEntity.
	 *
	 */
	public CarrierLicenseEntity carrierLicenseModelToEntity(CarrierModel model, CarrierLicenseEntity entity) {
		if (model.getCarrierLicense() != null) {
			entity.setCarrierLicense(model.getCarrierLicense());
		}
		if (model.getCarrierCMACCode() != null) {
			entity.setCarrierCMACCode(model.getCarrierCMACCode());
		}
		if (model.getCarrierLicense() != null) {
			entity.setCarrierLicense(model.getCarrierLicense());
		}
		if (model.getNumberOfLicense() != null) {
			entity.setNumberOfLicense(model.getNumberOfLicense());
		}
		return entity;
	}

	/**
	 * This method will convert VendorModel To VendorEntity.
	 *
	 */
	public VendorEntity vendorModelToEntity(VendorModel model) {
		VendorEntity entity = new VendorEntity();
		if (model.getDispatchTerminalLocation() != null) {
			entity.setDispatchTerminalLocation(model.getDispatchTerminalLocation());
		}
		if (model.getDispatchTerminalCode() != null) {
			entity.setDispatchTerminalCode(model.getDispatchTerminalCode());
		}
		if (model.getDispatchTerminalTelephone() != null) {
			entity.setDispatchTerminalTelephone(model.getDispatchTerminalTelephone());
		}
		if (model.getDispatchTerminalFax() != null) {
			entity.setDispatchTerminalFax(model.getDispatchTerminalFax());
		}
		if (model.getVendor() != null) {
			entity.setVendor(model.getVendor());
		}
		return entity;
	}

	/**
	 * This method will convert UserModel To UserEntity.
	 *
	 */

	public UserEntity userModeToEntity(UserModel model, UserEntity userEntity) {

		if (model.getUserName() != null) {
			userEntity.setUserName(model.getUserName());
		}
		if (model.getPassword() != null) {
			userEntity.setPassword(model.getPassword());
		}
		if (model.getFaxNumber() != null) {
			userEntity.setFaxNumber(model.getFaxNumber());
		}
		if (model.getFirstName() != null) {
			userEntity.setFirstName(model.getFirstName());
		}
		if (model.getLastName() != null) {
			userEntity.setLastName(model.getLastName());
		}
		if (model.getPhoneNumber() != null) {
			userEntity.setPhoneNumber(model.getPhoneNumber());
		}

		if (model.getImageId() != null) {
			userEntity.setImageId(model.getImageId());
		}
		userEntity.setCreateDate(new java.util.Date());

		return userEntity;
	}

	public UserRoleEntity userRoleModeToEntity(UserRoleEntity userRoleEntity, UserRoleModel model, Integer roleId) {

		if (model.getUserId() != null) {
			userRoleEntity.setUserId(model.getUserId());
		}

		if (roleId != null) {

			userRoleEntity.setRoleId(roleId);
		}

		if (model.getUpdateBY() != null) {
			userRoleEntity.setUpdateBY(model.getUpdateBY());
		}
		if (model.getCreatedBY() != null) {
			userRoleEntity.setCreatedBY(model.getCreatedBY());
		}
		if (model.getCreatedB() != null) {
			userRoleEntity.setCreatedB(model.getCreatedB());
		}

		userRoleEntity.setCreateDate(new java.util.Date());
		userRoleEntity.setUpdateDate(new java.util.Date());

		return userRoleEntity;
	}

	public LocationEntity locationModeToEntity(LocationModel model, LocationEntity locationEntity) {

		if (model.getIsDeliveryLocation() != null) {
			locationEntity.setIsDeliveryLocation(model.getIsDeliveryLocation());
		}

		if (model.getIsSTILocation() != null) {
			locationEntity.setIsSTILocation(model.getIsSTILocation());
		}

		if (model.getLoadId() != null) {
			locationEntity.setLoadId(model.getLoadId());
		}

		if (model.getLocationAddressId() != null) {
			locationEntity.setLocationAddressId(model.getLocationAddressId());
		}

		if (model.getLocationContactEmail() != null) {
			locationEntity.setLocationContactEmail(model.getLocationContactEmail());
		}

		if (model.getLocationContactName() != null) {
			locationEntity.setLocationContactName(model.getLocationContactName());
		}
		if (model.getLocationContactPhone() != null) {
			locationEntity.setLocationContactPhone(model.getLocationContactPhone());
		}
		/*if (model.getLocationId() != null) {
			locationEntity.setLocationId(model.getLocationId());
		}*/
		if (model.getLocationTypeId() != null) {
			locationEntity.setLocationTypeId(model.getLocationTypeId());
		}
		if (model.getLocationNotes() != null) {
			locationEntity.setLocationNotes(model.getLocationNotes());
		}
		if (model.getLocationName() != null) {
			locationEntity.setLocationName(model.getLocationName());
		}
		locationEntity.setCreateDate(new java.util.Date());
		locationEntity.setUpdateDate(new java.util.Date());

		return locationEntity;
	}

}
