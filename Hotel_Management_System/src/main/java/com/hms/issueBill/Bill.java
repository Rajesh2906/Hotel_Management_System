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
	private String guestMemberCode;
	private Double quantity;
	private Double price;
	private Double taxes;
	private Date date;
	private Double services;
	private Double unit;

	// empty constructer
	public Bill() {

	}

	public Bill(String billingNo, Double quantity, Double price, Double taxes, Date date, Double services,
			Double unit) {
		super();
		this.billingNo = billingNo;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.date = date;
		this.services = services;
		this.unit = unit;
	}

	public String getGuestMemberCode() {
		return guestMemberCode;
	}

	public void setGuestMemberCode(String guestMemberCode) {
		this.guestMemberCode = guestMemberCode;
	}

	public String getBillingNo() {
		return billingNo;
	}

	public void setBillingNo(String billingNo) {
		this.billingNo = billingNo;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
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
