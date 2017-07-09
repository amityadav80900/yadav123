package com.icl.epod.service;

import java.util.List;

import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.LocationEntity;
import com.icl.epod.entity.RoleEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.model.CarrierModel;
import com.icl.epod.model.LocationModel;
import com.icl.epod.model.UserModel;
import com.icl.epod.model.UserRoleModel;

/**
 * @author Vijendra.y
 *
 */
public interface IclEpodService {

	Integer addCarrier(CarrierModel model);

	void updateCarrier(Integer itemId, CarrierModel model);

	List<CarrierEntity> getAllCarrier();

	List<UserEntity> getAllUsers();

	CarrierEntity getCarrier(Integer itemId);

	void removeCarrier(Integer itemId);

	UserEntity findById(Integer userId);

	Integer saveIclUser(UserModel model);

	UserEntity updateIclUser(Integer userId, UserModel model);

	void deleteUserById(Integer userId);

	Integer assignRolesToIclUser(UserRoleModel model);

	List<RoleEntity> getAllRoles();

	List<RoleEntity> getAllRolesWithRoleId();

	List<UserEntity> getAllUsersWithUserId();

	UserEntity getUserById(Integer userId);

	List<RoleEntity> getAllUsersRoles();

	RoleEntity getRolesByRoleId(Integer roleId);

	Integer addLocationDetails(LocationModel model);

	LocationEntity findByLocationId(Integer locationId);

	LocationEntity updateLocationDetails(Integer locationId, LocationModel model);

}
