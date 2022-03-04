package com.hms.reservation;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

@Component
@Document(collection = "Reservation")
public class Reservation {

	private String status;
	private int noofchildren;
	private int noofadults;

	@ApiModelProperty(required = true, dataType = "org.joda.time.LocalDate")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private LocalDate checkin;

	@ApiModelProperty(required = true, dataType = "org.joda.time.LocalDate")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private LocalDate checkout;
	private int noofnights;
	@Id
	private String code;

	public Reservation() {
	}

	public Reservation(String status, int noofchildren, int noofadults, LocalDate checkin, LocalDate checkout,
			int noofnights, String code) {
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

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
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