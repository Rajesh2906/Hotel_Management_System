package com.reservation;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Reservation")
public class Reservation {

	private String status;
	private int noofchildren;
	private int noofadults;
	private Date checkindate;
	private Date checkoutdate;
	private int noofnights;
	@Id
	private String code;

	public Reservation() {
	}

	public Reservation(String status, int noofchildren, int noofadults, Date checkindate, Date checkoutdate,
			int noofnights, String code) {
		super();
		this.status = status;
		this.noofchildren = noofchildren;
		this.noofadults = noofadults;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
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

	public Date getCheckindate() {
		return checkindate;
	}

	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}

	public Date getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
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
