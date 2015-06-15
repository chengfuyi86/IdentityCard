/* 
 * Copyright 2015 ResidenceAddress Model.
 *  
 * This document may not be reproduced, distributed or used 
 * in any manner whatsoever without the expressed written 
 * permission of East.
 */
package com.east.identitycard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * <p>ResidenceAddress Model.</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: East</p>
 * <p>ResidenceAddress generated by hbm2java</p>
 * @author ManFromEast(Cheng Fuyi)
 * @version <p> 1.0: Created</p>
 */
@Entity
@Table(name = "residence_address", catalog = "test")
public class ResidenceAddress implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5652982034728134669L;
	private Integer identityCardId;
	private IdentityCard identityCard;
	private String provinceState;
	private String cityCounty;
	private String district;
	private String town;
	private String villageStreet;
	private String fullAddress;

	public ResidenceAddress() {
	}

	public ResidenceAddress(IdentityCard identityCard, String provinceState,
			String cityCounty, String district, String town,
			String villageStreet) {
		this.identityCard = identityCard;
		this.provinceState = provinceState;
		this.cityCounty = cityCounty;
		this.district = district;
		this.town = town;
		this.villageStreet = villageStreet;
	}

	public ResidenceAddress(IdentityCard identityCard, String provinceState,
			String cityCounty, String district, String town,
			String villageStreet, String fullAddress) {
		this.identityCard = identityCard;
		this.provinceState = provinceState;
		this.cityCounty = cityCounty;
		this.district = district;
		this.town = town;
		this.villageStreet = villageStreet;
		this.fullAddress = fullAddress;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "identityCard"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "IDENTITY_CARD_ID", unique = true, nullable = false)
	public Integer getIdentityCardId() {
		return this.identityCardId;
	}

	public void setIdentityCardId(Integer identityCardId) {
		this.identityCardId = identityCardId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public IdentityCard getIdentityCard() {
		return this.identityCard;
	}

	public void setIdentityCard(IdentityCard identityCard) {
		this.identityCard = identityCard;
	}

	@Column(name = "PROVINCE_STATE", nullable = false, length = 30)
	public String getProvinceState() {
		return this.provinceState;
	}

	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}

	@Column(name = "CITY_COUNTY", nullable = false, length = 30)
	public String getCityCounty() {
		return this.cityCounty;
	}

	public void setCityCounty(String cityCounty) {
		this.cityCounty = cityCounty;
	}

	@Column(name = "DISTRICT", nullable = false, length = 30)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "TOWN", nullable = false, length = 30)
	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Column(name = "VILLAGE_STREET", nullable = false)
	public String getVillageStreet() {
		return this.villageStreet;
	}

	public void setVillageStreet(String villageStreet) {
		this.villageStreet = villageStreet;
	}

	@Column(name = "FULL_ADDRESS")
	public String getFullAddress() {
		return this.fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}
