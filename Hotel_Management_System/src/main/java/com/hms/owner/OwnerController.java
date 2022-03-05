package com.hms.owner;

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
import com.hms.rooms.RoomsController;
import com.hms.searchRooms.RoomSearchController;
import com.hms.setRates.RateController;
import com.hms.setRates.Rates;
import com.hms.staff.Staff;
import com.hms.staff.StaffController;

@RestController
@RequestMapping("/Owner")
public class OwnerController {

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

	// RoomsController Access

	@Autowired
	RoomsController roomscontroller;

	@RequestMapping(value = "/RoomsController/Rooms", method = RequestMethod.GET)
	public List<Rooms> getAllRoomsData() {
		return roomscontroller.getAllRoomsData();

	}

	@RequestMapping(value = "/RoomsController/UpdateRooms", method = RequestMethod.PUT)
	public void updateTotalRooms(@RequestBody Rooms rooms) {
		roomscontroller.updateTotalRooms(rooms);
	}

	@RequestMapping(value = "/RoomsController/AddRooms", method = RequestMethod.POST)
	public void addTotalRooms(@RequestBody Rooms rooms) {
		roomscontroller.addTotalRooms(rooms);
	}

	// RoomSearchController Access

	@Autowired
	RoomSearchController roomsearchcontroller;

	@RequestMapping(value = "/RoomSearchController/aAailableRooms", method = RequestMethod.GET)
	public List<Rooms> getavailablerooms() {
		return roomsearchcontroller.getavailablerooms();
	}

	// SetRates Controller Access

	@Autowired
	RateController ratecontroller;

	@RequestMapping(value = "/SetRatesController/SetRate", method = RequestMethod.POST)
	public void setRates(@RequestBody Rates rate) {
		ratecontroller.setRates(rate);
	}

	@RequestMapping(value = "/SetRatesController/GetAllrates", method = RequestMethod.GET)
	public List<Rates> getRates() {
		return ratecontroller.getRates();
	}

	@RequestMapping(value = "/SetRatesController/UpdateRatesWithId/{Id}", method = RequestMethod.PUT)
	public void updateRates(Rates rates, @PathVariable("Id") String id) {
		ratecontroller.updateRates(rates, id);
	}

	// Staff Controller Access

	@Autowired
	StaffController staffcontroller;

	@RequestMapping(value = "/staffController/GetAllStaff", method = RequestMethod.GET)
	public List<Staff> getAllStaff() {
		return staffcontroller.getAllStaff();
	}

	@RequestMapping(value = "/staffController/AddStaff", method = RequestMethod.POST)
	public Staff addStaff(@RequestBody Staff staff) {
		return staffcontroller.addStaff(staff);
	}

	@RequestMapping(value = "/staffController/{staffCode}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("staffCode") String staffCode) {
		staffcontroller.deleteById(staffCode);
	}

	@RequestMapping(value = "/staffController/UpdateStaff", method = RequestMethod.PUT)
	public Staff updateById(@RequestBody Staff staffCode) {
		return staffcontroller.updateById(staffCode);
	}

	@RequestMapping(value = "/staffController/{staffCode}", method = RequestMethod.GET)
	public Staff getStaffById(@PathVariable("staffCode") String staffCode) {
		return staffcontroller.getStaffById(staffCode);
	}

}
