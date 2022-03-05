package com.hms.issueBill;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Bill")
public class Bill {

	@Id
	private String billingNo;
	private String guestMemberCode_;
	private Double quantity;
	private Double price_;
	private Double taxes_;
	private Date date;
	private Double services;
	private Double unit;

	// empty constructer
	public Bill() {

	}

	public Bill(String billingNo, String guestMemberCode_, Double quantity, Double price_, Double taxes_, Date date,
			Double services, Double unit) {
		super();
		this.billingNo = billingNo;
		this.guestMemberCode_ = guestMemberCode_;
		this.quantity = quantity;
		this.price_ = price_;
		this.taxes_ = taxes_;
		this.date = date;
		this.services = services;
		this.unit = unit;
	}

	public String getBillingNo() {
		return billingNo;
	}

	public void setBillingNo(String billingNo) {
		this.billingNo = billingNo;
	}

	public String getGuestMemberCode_() {
		return guestMemberCode_;
	}

	public void setGuestMemberCode_(String guestMemberCode_) {
		this.guestMemberCode_ = guestMemberCode_;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice_() {
		return price_;
	}

	public void setPrice_(Double price_) {
		this.price_ = price_;
	}

	public Double getTaxes_() {
		return taxes_;
	}

	public void setTaxes_(Double taxes_) {
		this.taxes_ = taxes_;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getServices() {
		return services;
	}

	public void setServices(Double services) {
		this.services = services;
	}

	public Double getUnit() {
		return unit;
	}

	public void setUnit(Double unit) {
		this.unit = unit;
	}

	/*
	 * @Override public String toString() { return "Bill [billcode=" + billcode +
	 * ", billingNo=" + billingNo + ", quantity=" + quantity + ", price=" + price +
	 * ", taxes=" + taxes + ", date=" + date + ", services=" + services + ", unit="
	 * + unit + ", Total=" + Total + "]"; }
	 */

	// for the total bill reciept
	/*
	 * public Double generateTotalBill() { return (price + taxes + services + unit);
	 * }
	 */

}
