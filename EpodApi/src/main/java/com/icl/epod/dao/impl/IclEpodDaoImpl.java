package com.icl.epod.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icl.epod.dao.IclEpodDao;
import com.icl.epod.entity.AddressEntity;
import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.LocationEntity;
import com.icl.epod.entity.RoleEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.entity.UserRoleEntity;
import com.icl.epod.util.HibernateUtil;

/**
 * @author Vijendra.y
 *
 */

@Repository
public class IclEpodDaoImpl implements IclEpodDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	private static final Logger logger = Logger.getLogger(IclEpodDaoImpl.class);

	@Override
	public Integer addCarrier(AddressEntity entity) {
		logger.debug("EpodAPI IclEpodDaoImpl addAddress  Enter");
		return (Integer) hibernateUtil.create(entity);
	}

	/**
	 * Generic Method for fetch by key
	 *
	 */
	@Override
	public <T> T fetchByKey(Serializable id, Class<T> entityClass) {
		logger.debug("EpodAPI IclEpodDaoImpl fetchByKey  Enter");
		return hibernateUtil.fetchById(id, entityClass);
	}

	@Override
	public void updateCarrier(AddressEntity entity) {
		logger.debug("EpodAPI IclEpodDaoImpl updateCarrier  Enter");
		hibernateUtil.update(entity);
		logger.debug("EpodAPI IclEpodDaoImpl updateCarrier  Exit");

	}

	@Override
	public void updateIclUser(UserEntity entity) {
		logger.debug("EpodAPI IclEpodDaoImpl updateIclUser  Enter");
		hibernateUtil.update(entity);
	}

	@Override
	public List<CarrierEntity> getAllCarrier() {
		logger.debug("EpodAPI IclEpodDaoImpl getAllCarrier  Enter");
		return hibernateUtil.fetchAll(CarrierEntity.class);
	}

	@Override
	public void removeCarrier(Integer itemId, Class<CarrierEntity> entityClass) {
		logger.debug("EpodAPI IclEpodDaoImpl removeCarrier  Enter");
		hibernateUtil.delete(itemId, entityClass);
	}

	@Override
	public UserEntity findById(Integer userId) {
		logger.debug("EpodAPI IclEpodDaoImpl findById  Enter");
		return hibernateUtil.fetchById(userId, UserEntity.class);

	}

	@Override
	public Integer saveIclUser(UserEntity userModeToEntity) {
		logger.debug("EpodAPI IclEpodDaoImpl saveIclUser  Enter");
		return (Integer) hibernateUtil.create(userModeToEntity);
	}

	@Override
	public void deleteUserById(Integer userId) {
		logger.debug("EpodAPI IclEpodDaoImpl deleteUserById  Enter");
		hibernateUtil.delete(userId, UserEntity.class);
		logger.debug("EpodAPI IclEpodDaoImpl updateCarrier  Exit");

	}

	@Override
	public Integer assignRolesToIclUser(Integer userId, List<Integer> roles) {

		return (Integer) hibernateUtil.create(UserRoleEntity.class);
	}

	@Override
	public List<UserEntity> getAllUsers() {

		return hibernateUtil.fetchAll(UserEntity.class);
	}

	@Override
	public List<RoleEntity> getAllRoles() {

		return hibernateUtil.fetchAll(RoleEntity.class);
	}

	@Override
	public List<RoleEntity> getAllRolesWithRoleId() {

		return hibernateUtil.getAllRolesWithRoleId(RoleEntity.class);
	}

	@Override
	public List<UserEntity> getAllUsersWithUserId() {

		return hibernateUtil.getAllUserWithUserId(UserEntity.class);
	}

	@Override
	public Integer assignRolesToIclUser(UserRoleEntity entity) {

		return (Integer) hibernateUtil.create(entity);
	}

	@Override
	public UserEntity getUserById(Integer userId) {
		return hibernateUtil.fetchById(userId, UserEntity.class);
	}

	@Override
	public RoleEntity getRolesByRoleId(Integer roleId) {

		return hibernateUtil.fetchById(roleId, RoleEntity.class);
	}

	@Override
	public Integer addLocationDetails(LocationEntity entity) {

		return (Integer) hibernateUtil.create(entity);
	}

	@Override
	public LocationEntity findByLocationId(Integer locationId) {

		return hibernateUtil.fetchById(locationId, LocationEntity.class);
	}

	@Override
	public void updateLocationDetails(LocationEntity entity) {
		logger.debug("EpodAPI IclEpodDaoImpl updateCarrier  Enter");
		hibernateUtil.update(entity);
		logger.debug("EpodAPI IclEpodDaoImpl updateCarrier  Exit");
	}

}
