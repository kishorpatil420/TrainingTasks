package com.example.mobileManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="MOBILE_MANAGEMENT")
public class Mobile {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid",strategy = "uuid")
	@Column(name="MOBILE_ID")
	private String mobileId;
	
	@Column(name="MOBILE_COMPANY")
	private String mobileCompany;
	
	@Column(name="MOBILE_BRAND")
	private String mobileBrand;
	
	@Column(name="MOBILE_PRICE")
	private Integer mobilePrice;
	
	@Column(name="MOBILE_IMAGE")
	private boolean mobileImge;
	
	@Column(name = "MOBILE_PROCESSOR")
	private String mobileProcessor;
	
	@Column(name="MOBILE_RAM")
	private Integer mobileRam;
	
	@Column(name="MOBILE_ROM")
	private Integer mobileRom;

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileCompany() {
		return mobileCompany;
	}

	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public Integer getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(Integer mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public boolean isMobileImge() {
		return mobileImge;
	}

	public void setMobileImge(boolean mobileImge) {
		this.mobileImge = mobileImge;
	}

	public String getMobileProcessor() {
		return mobileProcessor;
	}

	public void setMobileProcessor(String mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}

	public Integer getMobileRam() {
		return mobileRam;
	}

	public void setMobileRam(Integer mobileRam) {
		this.mobileRam = mobileRam;
	}

	public Integer getMobileRom() {
		return mobileRom;
	}

	public void setMobileRom(Integer mobileRom) {
		this.mobileRom = mobileRom;
	}
	
	

}
