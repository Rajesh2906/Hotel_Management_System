package com.hms.guest;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Guest")
public class Guest {

	@Id
	private String memberCode;
	private String reserveCode_;
	private String roomNo_;
	private Date todayDate_;
	private String guestStatus_;
	private Long phoneNumber;
	private String company;
	private String name;
	private String email;
	private String gender;
	private String address;

	public Guest() {
	}

	public Guest(String memberCode, String reserveCode_, String roomNo_, Date todayDate_, String guestStatus_,
			Long phoneNumber, String company, String name, String email, String gender, String address) {
		super();
		this.memberCode = memberCode;
		this.reserveCode_ = reserveCode_;
		this.roomNo_ = roomNo_;
		this.todayDate_ = todayDate_;
		this.guestStatus_ = guestStatus_;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getReserveCode_() {
		return reserveCode_;
	}

	public void setReserveCode_(String reserveCode_) {
		this.reserveCode_ = reserveCode_;
	}

	public String getRoomNo_() {
		return roomNo_;
	}

	public void setRoomNo_(String roomNo_) {
		this.roomNo_ = roomNo_;
	}

	public Date getTodayDate_() {
		return todayDate_;
	}

	public void setTodayDate_(Date todayDate_) {
		this.todayDate_ = todayDate_;
	}

	public String getGuestStatus_() {
		return guestStatus_;
	}

	public void setGuestStatus_(String guestStatus_) {
		this.guestStatus_ = guestStatus_;
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
