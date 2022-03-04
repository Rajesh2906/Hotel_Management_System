package com.hms.reservation;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Reservation")
public class Reservation {

	private String status;
	private int noofchildren;
	private int noofadults;
	private String checkin;
	private String checkout;
	private int noofnights;
	@Id
	private String code;

	public Reservation() {
	}

	public Reservation(String status, int noofchildren, int noofadults, String checkin, String checkout, int noofnights,
			String code) {
		super();
		this.status = status;
		this.noofchildren = noofchildren;
		this.noofadults = noofadults;
		this.checkin = checkin;
		this.checkout = checkout;
		this.noofnights = noofnights;
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNoofchildren() {
		return noofchildren;
	}

	public void setNoofchildren(int noofchildren) {
		this.noofchildren = noofchildren;
	}

	public int getNoofadults() {
		return noofadults;
	}

	public void setNoofadults(int noofadults) {
		this.noofadults = noofadults;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getNoofnights() {
		return noofnights;
	}

	public void setNoofnights(int noofnights) {
		this.noofnights = noofnights;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}