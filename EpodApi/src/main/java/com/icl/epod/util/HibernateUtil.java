package com.icl.epod.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.icl.epod.entity.RoleEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.entity.UserRoleEntity;

/**
 * @author Vijendra.y
 *
 */
@Repository
@EnableTransactionManagement
public class HibernateUtil {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public <T> Serializable create(final T entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}

	@Transactional
	public <T> T update(final T entity) {
		sessionFactory.getCurrentSession().update(entity);
		return entity;
	}

	@Transactional
	public <T> void delete(final T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	@Transactional
	public <T> void delete(Serializable id, Class<T> entityClass) {
		T entity = fetchById(id, entityClass);
		delete(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public <T> List<T> fetchAll(Class<T> entityClass) {
		return sessionFactory.getCurrentSession().createQuery(" FROM " + entityClass.getName()).list();

	}

	@SuppressWarnings("rawtypes")
	@Transactional
	public <T> List fetchAll(String query) {
		return sessionFactory.getCurrentSession().createSQLQuery(query).list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public <T> T fetchById(Serializable id, Class<T> entityClass) {
		return (T) sessionFactory.getCurrentSession().get(entityClass, id);
	}

	@Transactional
	public <T> T updateFetch(Serializable id, Class<T> entityClass) {
		return fetchById(id, entityClass);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<UserEntity> getAllUserWithUserId(Class<UserEntity> entityClass) {

		return sessionFactory.getCurrentSession()
				.createQuery("select userId,userName FROM " + entityClass.getName()).list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public  List<RoleEntity> getAllRolesWithRoleId(Class<RoleEntity> entityClass) {

		return sessionFactory.getCurrentSession()
				.createQuery("select roleId,roleName FROM " + entityClass.getName()).list();
	}

	
}