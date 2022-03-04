package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {
	@Autowired
	private GuestService ser;

	@RequestMapping("/guest")
	public List<Guest> getGuestList() {
		return ser.getAllGuest();
	}

	@RequestMapping(value = "/guest/{code}/{roomNo}", method = RequestMethod.POST)
	public void addGuest(@RequestBody Guest guest, @PathVariable("code") String code,
			@PathVariable("roomNo") String roomNo) {
		ser.addifGuest(code, guest, roomNo);

	}

	@RequestMapping(value = "/updateguest/{code}/{roomNo}/{membercode}", method = RequestMethod.PUT)
	public void updateGuest(@PathVariable("code") String code, @PathVariable("roomNo") String roomNo,
			@PathVariable("membercode") String membercode) {
		ser.removeGuest(code, roomNo, membercode);

	}

}
