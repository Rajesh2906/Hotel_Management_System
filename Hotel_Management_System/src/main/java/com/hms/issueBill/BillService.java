package com.hms.issueBill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.guest.GuestRepository;
import com.hms.reservation.reservationRepository;
import com.hms.setRates.RateRepository;

@Service
public class BillService {

	@Autowired
	private BillRepository billrepo;
	@Autowired
	private GuestRepository guestrepo;
	@Autowired
	private RateRepository raterepo;
	@Autowired
	private reservationRepository resrepo;

	public Bill getBillByCode(String billCode) {

		return billrepo.findById(billCode).get();
	}

	public Bill setBillByGuestId(String memberCode, Bill bill) {
		if (guestrepo.existsById(memberCode)) {
			bill.setGuestMemberCode_(memberCode);
			String S = guestrepo.findById(memberCode).get().getReserveCode_();
			double oneNight = raterepo.findById("Rate01").get().getFirstNightPrice();
			double dayprice = raterepo.findById("Rate01").get().getDayprice();
			double nightprice = raterepo.findById("Rate01").get().getNightprice();
			int n = resrepo.findById(S).get().getNoofnights();
			if (n == 1) {
				bill.setPrice_(oneNight);
				Double tax = (bill.getPrice_() / 10);
				bill.setTaxes_(tax);
				return billrepo.insert(bill);
			} else if (n > 1) {
				bill.setPrice_((n * nightprice) + ((n - 1) * dayprice));
				Double tax = (bill.getPrice_() / 10);
				bill.setTaxes_(tax);
				return billrepo.insert(bill);

			} else {
				return billrepo.insert(bill);
			}
		}
		return null;
	}

	public Bill addifGuestGotBill(String memberCode, Bill billCode) {
		if (guestrepo.existsById(memberCode)) {
			return billrepo.insert(billCode);

		}
		return null;
	}

}
