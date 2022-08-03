package com.example.managementApis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="MANAGEMENT_APIS")
public class Management {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid",strategy = "uuid")
	@Column(name="MANAGEMENT_ID")
	private String managementId;
	
	@Column(name="MANAGEMENT_TYPE")
	private String managementType;
	
	
	@Column(name="MANAGEMENT_CONTROL")
	private String managementControl;
	
	@Column(name="MANAGEMENT_LEVEL")
	private String managementLevel;

	public String getManagementId() {
		return managementId;
	}

	public void setManagementId(String managementId) {
		this.managementId = managementId;
	}

	public String getManagementType() {
		return managementType;
	}

	public void setManagementType(String managementType) {
		this.managementType = managementType;
	}

	public String getManagementControl() {
		return managementControl;
	}

	public void setManagementControl(String managementControl) {
		this.managementControl = managementControl;
	}

	public String getManagementLevel() {
		return managementLevel;
	}

	public void setManagementLevel(String managementLevel) {
		this.managementLevel = managementLevel;
	}
	
	

}
