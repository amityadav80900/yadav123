
package com.icl.epod.controller;

import java.util.Iterator;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.LocationEntity;
import com.icl.epod.entity.RoleEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.model.CarrierModel;
import com.icl.epod.model.LocationModel;
import com.icl.epod.model.ResponseModel;
import com.icl.epod.model.UserModel;
import com.icl.epod.model.UserRoleModel;
import com.icl.epod.service.IclEpodService;

/**
 * @author Vijendra.y
 *
 */
@RestController
public class IclController {

	@Autowired
	private IclEpodService epodService;
	private static final Logger logger = Logger.getLogger(IclController.class);

	/**
	 * Add Carrier method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/CarrierDetails", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel addCarrier(@RequestBody CarrierModel model) {
		ResponseModel rm = new ResponseModel();
		try {
			logger.debug("EpodAPI Controller addCarrier Enter");
			Integer recordVal = epodService.addCarrier(model);
			if (recordVal != null) {
				rm.setSuccess("success");
				rm.setRecordNumber(recordVal);
				rm.setFailure("No Exception");
			}
			logger.debug("EpodAPI Controller addCarrier Exits");
		} catch (Exception e) {
			logger.error(e.getMessage());
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
		}
		return rm;
	}

	/**
	 * Update Carrier method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/CarrierDetails/{id}", method = RequestMethod.PUT, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel updateCarrier(@RequestBody CarrierModel model, @PathVariable("id") Integer itemId) {
		ResponseModel rm = new ResponseModel();

		logger.debug("EpodAPI Controller updateCarrier Enter");
		try {
			epodService.updateCarrier(itemId, model);
			rm.setSuccess("Record Updated Successfully");
			rm.setRecordNumber(itemId);
			rm.setFailure("No Exception");

		} catch (Exception e) {
			logger.error("EpodAPI Controller updateCarrier | method Exception" + e.getMessage());
			rm.setSuccess("Not Success");
			rm.setRecordNumber(itemId);
			rm.setFailure("Error while updating record" + e.getMessage());
			e.printStackTrace();
		}
		logger.debug("EpodAPI Controller updateCarrier Exits");
		return rm;
	}

	/**
	 * Delete Carrier method
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/CarrierDetails/{id}", method = RequestMethod.DELETE, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel removeCarrier(@PathVariable("id") Integer itemId) {
		ResponseModel rm = new ResponseModel();
		try {
			logger.debug("EpodAPI Controller removeCarrier Enter");
			epodService.removeCarrier(itemId);
			rm.setSuccess("Record Deleted Successfully - Decommission");
			rm.setRecordNumber(itemId);
			rm.setFailure("No Exception");
		} catch (Exception e) {
			logger.error(e.getMessage());
			rm.setSuccess("Not Success");
			rm.setRecordNumber(itemId);
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
		}
		logger.debug("EpodAPI Controller removeCarrier  Exists");
		return rm;
	}

	/**
	 * Get Specific Carrier method
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/CarrierDetails/{primaryKey}", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public CarrierEntity getCarrier(@PathVariable("primaryKey") Integer itemId) {

		logger.debug("EpodAPI Controller getCarrier Enter");
		CarrierEntity entity = null;
		try {

			entity = this.epodService.getCarrier(itemId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getCarrier | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getCarrier Exits");

		return entity;

	}

	/**
	 * Get All Carrier method
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/CarrierDetails", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public List<CarrierEntity> getAllCarrier() {
		logger.debug("EpodAPI Controller getAllCarrier Enter");
		List<CarrierEntity> carrierEntities = null;
		try {
			carrierEntities = epodService.getAllCarrier();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getAllCarrier | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getAllCarrier Exits");
		return carrierEntities;
	}

	/**
	 * Started For
	 * User.....................................................................
	 * .........................................................................
	 * ....
	 *
	 */

	/**
	 * Get All Users with UserId method
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/getAllUsersWithUserId", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public List<UserEntity> getAllUsersWithUserId() {
		logger.debug("EpodAPI Controllerget AllUsers Enter");
		List<UserEntity> userEntities = null;
		try {
			userEntities = epodService.getAllUsersWithUserId();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getAllUsersWithUserId | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getAllUsers Exits");
		return userEntities;
	}

	/**
	 * Get All Roles For user with roleId method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/RoleDetails/getAllUserRolesWithRoleId", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public List<RoleEntity> getAllUserRolesWithRoleId() {
		logger.debug("EpodAPI Controllerget getAllUserRoles Enter");
		List<RoleEntity> roleEntities = null;
		try {
			roleEntities = epodService.getAllRolesWithRoleId();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getAllUsersRoles | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getAllUsers Exits");
		return roleEntities;
	}

	/**
	 * Get All Users method
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public List<UserEntity> getAllUsers() {
		logger.debug("EpodAPI Controllerget AllUsers Enter");
		List<UserEntity> userEntities = null;
		try {
			userEntities = epodService.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getAllUsers | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getAllUsers Exits");
		return userEntities;
	}

	/**
	 * Get Role By roleId method
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/RoleDetails/{roleId}", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public RoleEntity getRolesByRoleId(@PathVariable("roleId") Integer roleId) {
		logger.debug("EpodAPI Controller getRolesByRoleId Enter");
		RoleEntity roleEntity = null;
		try {
			roleEntity = epodService.getRolesByRoleId(roleId);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getRolesByRoleI | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getRolesByRoleI Exits");
		return roleEntity;
	}

	/**
	 * Get All Roles For user method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/RoleDetails", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public List<RoleEntity> getAllUserRoles() {
		logger.debug("EpodAPI Controllerget getAllUserRoles Enter");
		List<RoleEntity> roleEntities = null;
		try {
			roleEntities = epodService.getAllUsersRoles();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getAllUsersRoles | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getAllUsers Exits");
		return roleEntities;
	}

	/**
	 * Get a User By userId
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/{userId}", method = RequestMethod.GET, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public UserEntity getUserById(@PathVariable("userId") Integer userId) {
		logger.debug("EpodAPI Controller getUserById Enter");
		UserEntity userEntity = null;
		try {
			userEntity = epodService.getUserById(userId);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("EpodAPI Controller getUserById | method Exception" + e.getMessage());
		}
		logger.debug("EpodAPI Controller getUserById Exits");
		return userEntity;
	}

	/**
	 * Create New User
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel createIclUser(@RequestBody UserModel model) {

		ResponseModel rm = new ResponseModel();
		try {
			logger.debug("EpodAPI Controller saveIclUser Enter");

			Integer recordVal = epodService.saveIclUser(model);
			if (recordVal != null) {
				rm.setSuccess("User Register Successfully..");
				rm.setRecordNumber(recordVal);
				rm.setFailure("No Exception");
			}
			logger.debug("EpodAPI Controller saveIclUser Exits");

		} catch (Exception e) {
			logger.error(e.getMessage());
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
		}
		return rm;
	}

	/**
	 * Update User method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/{userId}", method = RequestMethod.PUT, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel updateIclUser(@RequestBody UserModel model, @PathVariable("userId") Integer userId) {
		ResponseModel rm = new ResponseModel();

		logger.debug("EpodAPI Controller updateIclUserr Enter");
		try {

			epodService.updateIclUser(userId, model);
			rm.setSuccess("Record Updated Successfully");
			rm.setRecordNumber(userId);
			rm.setFailure("No Exception");

		} catch (Exception e) {
			logger.error("EpodAPI Controller updateIclUser | method Exception" + e.getMessage());
			rm.setSuccess("Not Success");
			rm.setRecordNumber(userId);
			rm.setFailure("Error while updating record" + e.getMessage());
			e.printStackTrace();
		}
		logger.debug("EpodAPI Controller updateIclUser Exits");
		return rm;
	}

	/**
	 * Delete a user method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/{userId}", method = RequestMethod.DELETE)
	public ResponseModel deleteUser(@PathVariable("userId") Integer userId) {

		ResponseModel rm = new ResponseModel();

		try {
			logger.debug("EpodAPI Controller deleteUser Enter");
			UserEntity user = epodService.findById(userId);
			if (user != null) {

				epodService.deleteUserById(userId);
				rm.setSuccess("Record Deleted Successfyully..");
				rm.setRecordNumber(userId);
				rm.setFailure("NO Exception");
			} else {
				rm.setSuccess("Record is not there.");
				rm.setRecordNumber(userId);
				rm.setFailure("No Exception");
			}
			logger.debug("EpodAPI Controller  deleteUser  Exits");
		} catch (Exception e) {
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
			rm.setFailure("Exception");
		}
		return rm;

	}

	/**
	 * Assign Roles To a User..
	 *
	 */

	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/assignRole", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel assignRolesToIclUser(@RequestBody UserRoleModel model) {

		ResponseModel rm = new ResponseModel();
		try {
			logger.debug("EpodAPI Controller assignRolesToIclUser Enter");

			Integer recordVal = epodService.assignRolesToIclUser(model);
			if (recordVal != null) {
				rm.setSuccess("Roles Assign Successfully..");
				rm.setRecordNumber(recordVal);
				rm.setFailure("No Exception");
			}
			logger.debug("EpodAPI Controller assignRolesToIclUser Exits");

		} catch (Exception e) {
			logger.error(e.getMessage());
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
		}
		return rm;
	}

	/**
	 * End For
	 * User.....................................................................
	 * .........................................................................
	 * ....
	 *
	 */
	
	


	/**
	 * Add Location method
	 *
	 */
	
	

	@RequestMapping(value = "/resource-inventory/api/v1/LocationDetails", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel addLocationDetails(@RequestBody LocationModel model) {

		ResponseModel rm = new ResponseModel();
		try {
			logger.debug("EpodAPI Controller addLocationDetails Enter");

			Integer recordVal = epodService.addLocationDetails(model);
			if (recordVal != null) {
				rm.setSuccess("Location Details Added Successfully..");
				rm.setRecordNumber(recordVal);
				rm.setFailure("No Exception");
			}
			logger.debug("EpodAPI Controller addLocationDetails Exits");

		} catch (Exception e) {
			logger.error(e.getMessage());
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
		}
		return rm;
	}
	
	

	/**
	 * Delete a user method
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/{locationId}", method = RequestMethod.DELETE)
	public ResponseModel deleteLocationDetails(@PathVariable("locationId") Integer locationId) {

		ResponseModel rm = new ResponseModel();

		try {
			logger.debug("EpodAPI Controller deleteUser Enter");
			LocationEntity user = epodService.findByLocationId(locationId);
			if (user != null) {

				epodService.deleteUserById(locationId);
				rm.setSuccess("Record Deleted Successfyully..");
				rm.setRecordNumber(locationId);
				rm.setFailure("NO Exception");
			} else {
				rm.setSuccess("Record is not there.");
				rm.setRecordNumber(locationId);
				rm.setFailure("No Exception");
			}
			logger.debug("EpodAPI Controller  deleteUser  Exits");
		} catch (Exception e) {
			rm.setFailure("Error while deleting record" + e.getMessage());
			e.printStackTrace();
			rm.setFailure("Exception");
		}
		return rm;

	}
	
	
	
	
	/**
	 * Update Location Details
	 *
	 */
	@RequestMapping(value = "/resource-inventory/api/v1/UserDetails/{locationId}", method = RequestMethod.PUT, produces = {
			"application/json", "application/xml" }, consumes = { "application/json", "application/xml" })
	public ResponseModel updateLocationDetails(@RequestBody LocationModel model, @PathVariable("locationId") Integer locationId) {
		ResponseModel rm = new ResponseModel();

		logger.debug("EpodAPI Controller updateIclUserr Enter");
		try {

			epodService.updateLocationDetails(locationId, model);
			rm.setSuccess("Record Updated Successfully");
			rm.setRecordNumber(locationId);
			rm.setFailure("No Exception");

		} catch (Exception e) {
			logger.error("EpodAPI Controller updateIclUser | method Exception" + e.getMessage());
			rm.setSuccess("Not Success");
			rm.setRecordNumber(locationId);
			rm.setFailure("Error while updating record" + e.getMessage());
			e.printStackTrace();
		}
		logger.debug("EpodAPI Controller updateIclUser Exits");
		return rm;
	}


}