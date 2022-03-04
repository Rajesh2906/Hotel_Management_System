package com.hms.guest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Guest")
public class Guest {

	@Id
	private String memberCode;
	private String reserveCode;
	private String roomNo;
	private Long phoneNumber;
	private String company;
	private String name;
	private String email;
	private String gender;
	private String address;

	public Guest() {
	}

	public Guest(String memberCode, String reserveCode, String roomNo, Long phoneNumber, String company, String name,
			String email, String gender, String address) {
		super();
		this.memberCode = memberCode;
		this.reserveCode = reserveCode;
		this.roomNo = roomNo;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getReserveCode() {
		return reserveCode;
	}

	public void setReserveCode(String reserveCode) {
		this.reserveCode = reserveCode;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
