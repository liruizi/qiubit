package com.qiubit.pojo;

import java.util.Date;

public class QiubitUser {
	private Integer id;

	private String email;

	private String password;

	private Byte tfaEnabled;

	private String userName;

	private String firstName;

	private String lastName;

	private String country;

	private String city;

	private String postalCode;

	private String mobile;

	private String mobileNationalCode;

	private String residentAddress;

	private String birthAddress;

	private Date birthDate;

	private Date createdAt;

	private Date updatedAt;

	private Byte emailVerified;

	private Byte mobileVerified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Byte getTfaEnabled() {
		return tfaEnabled;
	}

	public void setTfaEnabled(Byte tfaEnabled) {
		this.tfaEnabled = tfaEnabled;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName == null ? null : firstName.trim();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName == null ? null : lastName.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode == null ? null : postalCode.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getMobileNationalCode() {
		return mobileNationalCode;
	}

	public void setMobileNationalCode(String mobileNationalCode) {
		this.mobileNationalCode = mobileNationalCode == null ? null : mobileNationalCode.trim();
	}

	public String getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress == null ? null : residentAddress.trim();
	}

	public String getBirthAddress() {
		return birthAddress;
	}

	public void setBirthAddress(String birthAddress) {
		this.birthAddress = birthAddress == null ? null : birthAddress.trim();
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Byte getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(Byte emailVerified) {
		this.emailVerified = emailVerified;
	}

	public Byte getMobileVerified() {
		return mobileVerified;
	}

	public void setMobileVerified(Byte mobileVerified) {
		this.mobileVerified = mobileVerified;
	}
}