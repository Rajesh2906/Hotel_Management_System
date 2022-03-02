package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.reservation.Reservation;

@RestController
public class GuestController {
	@Autowired
	private GuestService ser;
	@Autowired
	private Reservation res;

	@RequestMapping("/guest")
	public List<Guest> getGuestList() {
		return ser.getAllGuest();
	}

	/*
	 * @RequestMapping(value = "/guest/{code}", method = RequestMethod.PUT) public
	 * Guest addGuest(@RequestBody Guest guest, @PathVariable("code") String code) {
	 * return ser.addGuest(code, guest); }
	 */

	@RequestMapping(value = "/guest", method = RequestMethod.POST)
	public void addGuests(@RequestBody Guest guest) {
		ser.addGuest(guest);
	}

}
