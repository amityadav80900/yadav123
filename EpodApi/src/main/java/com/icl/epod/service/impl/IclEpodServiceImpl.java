package com.icl.epod.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icl.epod.dao.IclEpodDao;
import com.icl.epod.entity.AddressEntity;
import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.CarrierLicenseEntity;
import com.icl.epod.entity.LocationEntity;
import com.icl.epod.entity.RoleEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.entity.UserRoleEntity;
import com.icl.epod.model.CarrierModel;
import com.icl.epod.model.LocationModel;
import com.icl.epod.model.UserModel;
import com.icl.epod.model.UserRoleModel;
import com.icl.epod.service.IclEpodService;
import com.icl.epod.util.CommonUtils;

/**
 * @author Vijendra.y
 *
 */
@Service
public class IclEpodServiceImpl implements IclEpodService {
	@Autowired
	private IclEpodDao epodDao;
	@Autowired
	private CommonUtils commonUtils;
	private static final Logger logger = Logger.getLogger(IclEpodServiceImpl.class);
	private Integer recordCount = 0;
	private CarrierEntity carrierEntity;
	private AddressEntity addressEntity;
	private UserRoleEntity userroleEntity;

	@Override
	public Integer addCarrier(CarrierModel model) {
		logger.debug("EpodAPI IclEpodServiceImpl addAddress  Enter");

		if (model != null) {
			CarrierLicenseEntity carrierLicenseEntity = new CarrierLicenseEntity();
			carrierLicenseEntity = commonUtils.carrierLicenseModelToEntity(model, carrierLicenseEntity);
			carrierLicenseEntity.setCreatedDate(new Date());
			carrierEntity = new CarrierEntity();
			carrierEntity = commonUtils.carrierModeToEntity(model, carrierEntity);
			carrierEntity.setCreatedDate(new Date());
			carrierEntity.setCarrierLicenseEntity(carrierLicenseEntity);
			if (model.getAddressModels() != null) {
				model.getAddressModels().forEach(addressModel -> {
					AddressEntity addressEntity = new AddressEntity();
					addressEntity = commonUtils.addressrModeToEntity(addressModel, addressEntity);
					addressEntity.setCreatedDate(new Date());
					addressEntity.setCarrierEntity(carrierEntity);
					recordCount = recordCount + epodDao.addCarrier(addressEntity);
				});
			}
		}
		return recordCount;
	}

	@Override
	public void updateCarrier(Integer itemId, CarrierModel model) {
		logger.debug("EpodAPI IclEpodServiceImpl updateCarrier  Enter");
		CarrierLicenseEntity carrierLicenseEntity = null;
		if (itemId != null) {
			carrierEntity = epodDao.fetchByKey(itemId, CarrierEntity.class);
			if (carrierEntity.getCarrierLicenseEntity() != null) {
				carrierLicenseEntity = commonUtils.carrierLicenseModelToEntity(model,
						carrierEntity.getCarrierLicenseEntity());
				carrierLicenseEntity.setUpdateDate(new Date());
			}
			carrierEntity = commonUtils.carrierModeToEntity(model, carrierEntity);
			carrierEntity.setUpdateDate(new Date());
			carrierEntity.setCarrierLicenseEntity(carrierLicenseEntity);
			if (model.getAddressModels() != null && carrierEntity.getAddressEntity() != null) {
				for (int i = 0; i < model.getAddressModels().size()
						&& i < carrierEntity.getAddressEntity().size(); i++) {
					addressEntity = commonUtils.addressrModeToEntity(model.getAddressModels().get(i),
							carrierEntity.getAddressEntity().get(i));
					addressEntity.setCreatedDate(new Date());
					addressEntity.setCarrierEntity(carrierEntity);
					epodDao.updateCarrier(addressEntity);
				}
			}
		}
		logger.debug("EpodAPI IclEpodServiceImpl updateCarrier  Exits");

	}

	@Override
	public List<CarrierEntity> getAllCarrier() {
		logger.debug("EpodAPI IclEpodServiceImpl getAllCarrier  Enter");
		return epodDao.getAllCarrier();
	}

	@Override
	public CarrierEntity getCarrier(Integer itemId) {
		logger.debug("EpodAPI IclEpodServiceImpl getCarrier  Enter");
		return epodDao.fetchByKey(itemId, CarrierEntity.class);
	}

	@Override
	public void removeCarrier(Integer itemId) {
		logger.debug("EpodAPI IclEpodServiceImpl getCarrier  Enter");
		epodDao.removeCarrier(itemId, CarrierEntity.class);
	}

	@Override
	public UserEntity findById(Integer userId) {

		logger.debug("EpodAPI IclEpodServiceImpl findById Enter");
		return epodDao.findById(userId);
	}

	@Override
	public Integer saveIclUser(UserModel model) {

		logger.debug("EpodAPI IclEpodServiceImpl saveIclUser  Enter");
		UserEntity userEntity = new UserEntity();
		return epodDao.saveIclUser(commonUtils.userModeToEntity(model, userEntity));
	}

	@Override
	public UserEntity updateIclUser(Integer userId, UserModel model) {

		logger.debug("EpodAPI IclEpodServiceImpl updateIclUser  Enter");
		UserEntity userEntity = null;
		if (userId != null) {
			userEntity = epodDao.fetchByKey(userId, UserEntity.class);
			userEntity = commonUtils.userModeToEntity(model, userEntity);
			userEntity.setUserId(userId);
			userEntity.setCreateDate(new Date());
			epodDao.updateIclUser(userEntity);

		}
		logger.debug("EpodAPI IclEpodServiceImpl updateIclUser  Exits");
		return userEntity;

	}

	@Override
	public void deleteUserById(Integer userId) {

		logger.debug("EpodAPI IclEpodServiceImpl deleteUserById Enter");
		epodDao.deleteUserById(userId);
		logger.debug("EpodAPI IclEpodServiceImpl deleteUserById Enter");

	}

	@Override
	public Integer assignRolesToIclUser(UserRoleModel model) {

		/*
		 * logger.debug("EpodAPI IclEpodServiceImpl saveIclUser  Enter");
		 * UserRoleEntity userRoleEntity = new UserRoleEntity(); return
		 * epodDao.assignRolesToIclUser(commonUtils.userRoleModeToEntity(model,
		 * userRoleEntity));
		 */

		if (model != null) {
			UserRoleEntity userRoleEntity = new UserRoleEntity();
			// userRoleEntity = commonUtils.userRoleModeToEntity(userRoleEntity,
			// model);
			if (model.getRoleId() != null) {

				for (Integer roleId : model.getRoleId()) {
					userRoleEntity = new UserRoleEntity();
					userRoleEntity = commonUtils.userRoleModeToEntity(userRoleEntity, model, roleId);

					recordCount = recordCount + epodDao.assignRolesToIclUser(userRoleEntity);
				}
			}
		}

		return recordCount;

	}

	@Override
	public List<UserEntity> getAllUsers() {
		logger.debug("EpodAPI IclEpodServiceImpl  getAllUsers  Enter");
		return epodDao.getAllUsers();
	}

	@Override
	public List<RoleEntity> getAllRoles() {
		logger.debug("EpodAPI IclEpodServiceImpl  getAllRoles  Enter");
		return epodDao.getAllRoles();
	}

	@Override
	public List<RoleEntity> getAllRolesWithRoleId() {

		return epodDao.getAllRolesWithRoleId();
	}

	

	@Override
	public UserEntity getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return epodDao.getUserById(userId);
	}

	@Override
	public List<UserEntity> getAllUsersWithUserId() {
		// TODO Auto-generated method stub
		return epodDao.getAllUsersWithUserId();
	}

	@Override
	public List<RoleEntity> getAllUsersRoles() {
		// TODO Auto-generated method stub
		return epodDao.getAllRoles();
	}

	@Override
	public RoleEntity getRolesByRoleId(Integer roleId) {
		// TODO Auto-generated method stub
		return epodDao.getRolesByRoleId(roleId);
	}

	@Override
	public Integer addLocationDetails(LocationModel model) {
		logger.debug("EpodAPI IclEpodServiceImpl saveIclUser  Enter");
		LocationEntity locationEntity = new LocationEntity();
		return epodDao.addLocationDetails(commonUtils.locationModeToEntity(model, locationEntity));
	}

	@Override
	public LocationEntity findByLocationId(Integer locationId) {
		// TODO Auto-generated method stub
		return epodDao.findByLocationId(locationId);
	}

	@Override
	public LocationEntity  updateLocationDetails(Integer locationId, LocationModel model) {

		logger.debug("EpodAPI IclEpodServiceImpl updateIclUser  Enter");
		LocationEntity locationEntity = null;
		if (locationId != null) {
			locationEntity = epodDao.fetchByKey(locationId, LocationEntity.class);
			locationEntity = commonUtils.locationModeToEntity(model, locationEntity);
			locationEntity.setLocationId(locationId);
			locationEntity.setCreateDate(new Date());
			locationEntity.setUpdateDate(new Date());
			epodDao.updateLocationDetails(locationEntity);

		}
		logger.debug("EpodAPI IclEpodServiceImpl updateIclUser  Exits");
		return locationEntity;

	}

}
