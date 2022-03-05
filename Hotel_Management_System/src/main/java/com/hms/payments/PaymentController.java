package com.hms.payments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentser;

	// @RequestMapping("/getPaymentHistory/{cardNo}")
	public List<Payment> getPaymentByCardNo(@PathVariable("cardNo") Long cardNo) {
		return paymentser.getPayementsByCardNo();
	}

	// @RequestMapping(value = "/addPayment/{billingNo}", method =
	// RequestMethod.POST)
	public void addPayment(@RequestBody Payment payment, @PathVariable("billingNo") String billingNo) {

		paymentser.addPayment(payment, billingNo);
	}

}
