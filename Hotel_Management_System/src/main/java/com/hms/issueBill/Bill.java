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
	private String quantity;
	private Double price;
	private Double taxes;
	private Date date;
	private Double services;
	private Double unit;
	/* private Double Total = price + taxes + services; */

	// empty constructer
	public Bill() {

	}

	public Bill(String billcode, String billingNo, String quantity, Double price, Double taxes, Date date,
			Double services, Double unit, Double total) {
		super();

		this.billingNo = billingNo;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.date = date;
		this.services = services;
		this.unit = unit;
		/* Total = total; */
	}

	/*
	 * public Double getTotal() { return Total; }
	 * 
	 * 
	 * public void setTotal(Double total) { Total = total; }
	 */

	public String getBillingNo() {
		return billingNo;
	}

	public void setBillingNo(String billingNo) {
		this.billingNo = billingNo;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
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
