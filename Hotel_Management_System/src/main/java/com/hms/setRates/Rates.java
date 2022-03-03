package com.hms.setRates;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Rates of RoomStay")
public class Rates {

	@Id
	private String rateId;
	private Double firstNightPrice;
	private Double nightprice;
	private Double dayprice;

	public Rates() {
	}

	public Rates(String rateId, Double firstNightPrice, Double nightprice, Double dayprice) {
		super();
		this.rateId = rateId;
		this.firstNightPrice = firstNightPrice;
		this.nightprice = nightprice;
		this.dayprice = dayprice;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public void setFirstNightPrice(Double firstNightPrice) {
		this.firstNightPrice = firstNightPrice;
	}

	public void setNightprice(Double nightprice) {
		this.nightprice = nightprice;
	}

	public void setDayprice(Double dayprice) {
		this.dayprice = dayprice;
	}

	public Double getFirstNightPrice() {
		return firstNightPrice;
	}

	public Double getNightprice() {
		return nightprice;
	}

	public Double getDayprice() {
		return dayprice;
	}

}
