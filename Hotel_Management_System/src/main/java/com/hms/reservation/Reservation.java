package com.hms.reservation;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Document(collection = "Reservation")
public class Reservation {

	private String status_;
	private int noofchildren;
	private int noofadults;

	// @ApiModelProperty(required = true, dataType = "org.joda.time.LocalDate")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date checkin;

	// @ApiModelProperty(required = true, dataType = "org.joda.time.LocalDate")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date checkout;
	private int noofnights;
	@Id
	private String code;

	public Reservation() {
	}

	public Reservation(String status_, int noofchildren, int noofadults, Date checkin, Date checkout, int noofnights,
			String code) {
		super();
		this.status_ = status_;
		this.noofchildren = noofchildren;
		this.noofadults = noofadults;
		this.checkin = checkin;
		this.checkout = checkout;
		this.noofnights = noofnights;
		this.code = code;
	}

	public String getStatus_() {
		return status_;
	}

	public void setStatus_(String status_) {
		this.status_ = status_;
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

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
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