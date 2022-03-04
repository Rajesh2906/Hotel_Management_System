package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.rooms.RoomsRepository;

@RestController
public class GuestController {
	@Autowired
	private GuestService ser;

	@Autowired
	RoomsRepository roomrepo;

	@RequestMapping("/guest")
	public List<Guest> getGuestList() {
		return ser.getAllGuest();
	}

	@RequestMapping(value = "/guest/{code}/{roomNo}", method = RequestMethod.POST)
	public Guest addGuest(@RequestBody Guest guest, @PathVariable("code") String code,
			@PathVariable("roomNo") String roomNo) {
		roomrepo.findById(roomNo).ifPresent(p -> p.setRoomStatus("active"));
		return ser.addifGuest(code, guest, roomNo);
	}

	/*
	 * @RequestMapping(value = "/guest", method = RequestMethod.POST) public void
	 * addGuests(@RequestBody Guest guest) { ser.addGuest(guest); }
	 */

}
