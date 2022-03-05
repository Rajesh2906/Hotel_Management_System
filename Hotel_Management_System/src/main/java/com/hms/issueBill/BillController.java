package com.hms.issueBill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receptionist")
public class BillController {

	/*
	 * @Autowired private Bill bill;
	 */
	@Autowired
	private BillService billservice;

	// @RequestMapping("/getbill/{billCode}")
	public Bill getBillById(@PathVariable("billcode") String billCode) {

		// System.out.println(bill.generateTotalBill());
		return billservice.getBillByCode(billCode);

	}

	// @RequestMapping(value = "/getBill/{memberCode}", method = RequestMethod.POST)
	public Bill setBillByGuestId(@RequestBody Bill bill, @PathVariable("memberCode") String memberCode) {
		return billservice.setBillByGuestId(memberCode, bill);

	}

	/*
	 * @RequestMapping(value = "/getBill/{memberCode}", method = RequestMethod.POST)
	 * public Bill addBillById(@RequestBody Bill bill, @PathVariable("memberCode")
	 * String memberCode) {
	 * 
	 * return billservice.addifGuestGotBill(memberCode, bill);
	 * 
	 * }
	 */

}
