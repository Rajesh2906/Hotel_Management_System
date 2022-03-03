package com.hms.payments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.issueBill.BillRepository;

@Service
public class PaymentService {

	@Autowired
	private BillRepository billrepo;

	@Autowired
	private PaymentRepository paymentrepo;

	public void addPayment(Payment payment, String billingNo) {
		if (billrepo.existsById(billingNo)) {

			payment.setBillingNo(billingNo);
			double price = billrepo.findById(billingNo).get().getPrice();
			double services = billrepo.findById(billingNo).get().getServices();
			double taxes = billrepo.findById(billingNo).get().getTaxes();
			double totalbill = price + services + taxes;
			payment.setTotal(totalbill);

			paymentrepo.insert(payment);
		}
	}

	public List<Payment> getPayementsByCardNo() {
		return paymentrepo.findAll();
	}

}
