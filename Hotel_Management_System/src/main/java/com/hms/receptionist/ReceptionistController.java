package com.hms.receptionist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.guest.Guest;
import com.hms.guest.GuestController;
import com.hms.issueBill.Bill;
import com.hms.issueBill.BillController;
import com.hms.payments.Payment;
import com.hms.payments.PaymentController;
import com.hms.reservation.Reservation;
import com.hms.reservation.reservationController;
import com.hms.rooms.Rooms;
import com.hms.searchRooms.RoomSearchController;

@RestController
@RequestMapping("/Receptionist")
public class ReceptionistController {

	// GeustController Access

	@Autowired
	GuestController guestcontroller;

	@RequestMapping(value = "/GuestController/GetAllGuests", method = RequestMethod.GET)
	public List<Guest> getGuestList() {
		return guestcontroller.getGuestList();
	}

	@RequestMapping(value = "/GuestController/AddGuest/{code}/{roomNo}", method = RequestMethod.POST)
	public void addGuest(@RequestBody Guest guest, @PathVariable("code") String code,
			@PathVariable("roomNo") String roomNo) {
		guestcontroller.addGuest(guest, code, roomNo);

	}

	@RequestMapping(value = "/GuestController/UpdateGuest/{code}/{roomNo}/{membercode}", method = RequestMethod.PUT)
	public void updateGuest(@PathVariable("code") String code, @PathVariable("roomNo") String roomNo,
			@PathVariable("membercode") String membercode) {
		guestcontroller.updateGuest(code, roomNo, membercode);

	}

	// IssueBillController Access

	@Autowired
	BillController billcontroller;

	@RequestMapping(value = "/BillController/GetBillWithGuestId/{billCode}", method = RequestMethod.GET)
	public Bill getBillById(@PathVariable("billcode") String billCode) {
		return billcontroller.getBillById(billCode);

	}

	@RequestMapping(value = "/BillController/SetBillWithGuestId/{memberCode}", method = RequestMethod.POST)
	public Bill setBillByGuestId(@RequestBody Bill bill, @PathVariable("memberCode") String memberCode) {
		return billcontroller.setBillByGuestId(bill, memberCode);

	}

	// PaymentController Access

	@Autowired
	PaymentController paymentcontroller;

	@RequestMapping(value = "/PaymentController/GetPaymentHistory/{cardNo}", method = RequestMethod.GET)
	public List<Payment> getPaymentByCardNo(@PathVariable("cardNo") Long cardNo) {
		return paymentcontroller.getPaymentByCardNo(cardNo);
	}

	@RequestMapping(value = "/PaymentController/AddPayment/{billingNo}", method = RequestMethod.POST)
	public void addPayment(@RequestBody Payment payment, @PathVariable("billingNo") String billingNo) {

		paymentcontroller.addPayment(payment, billingNo);
	}

	// ReservationController Access

	@Autowired
	reservationController reservationcontroller;

	@RequestMapping(value = "/ReservationController/GetAllReservations", method = RequestMethod.GET)
	public List<Reservation> getAllReservations() {
		return reservationcontroller.getAllReservations();
	}

	@RequestMapping(value = "/ReservationController/Reservation", method = RequestMethod.POST)
	public void addReservations(@RequestBody Reservation reservation) {
		reservationcontroller.addReservations(reservation);
	}

	// RoomSearchController Access

	@Autowired
	RoomSearchController roomsearchcontroller;

	@RequestMapping(value = "/RoomSearchController/aAailableRooms", method = RequestMethod.GET)
	public List<Rooms> getavailablerooms() {
		return roomsearchcontroller.getavailablerooms();
	}

}
