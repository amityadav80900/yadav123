package com.icl.epod.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user_role")
public class UserRoleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "ROLE_ID")
	private Integer roleId;

	@Column(name = "CREATE_DATE")
	private Date createDate;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "CREATED_B")
	private String createdB;

	@Column(name = "CREATED_BY")
	private String createdBY;

	@Column(name = "UPDATE_BY")
	private String updateBY;

	public String getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(String createdBY) {
		this.createdBY = createdBY;
	}

	public String getUpdateBY() {
		return updateBY;
	}

	public void setUpdateBY(String updateBY) {
		this.updateBY = updateBY;
	}

	public UserRoleEntity() {

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCreatedB() {
		return createdB;
	}

	public void setCreatedB(String createdB) {
		this.createdB = createdB;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Transient
	public int getId() {
		return id;
	}
    @Transient
	public void setId(int id) {
		this.id = id;
	}

}
