package com.hms.issueBill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.guest.GuestRepository;

@Service
public class BillService {

	@Autowired
	private BillRepository billrepo;
	@Autowired
	private GuestRepository guestrepo;

	public Bill getBillByCode(String billCode) {
		return billrepo.findById(billCode).get();
	}

	public Bill addifGuestGotBill(String memberCode, Bill billCode) {
		if (guestrepo.existsById(memberCode)) {
			return billrepo.insert(billCode);

		}
		return null;
	}

}
