package com.hms.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/receptionist")
public class reservationController {

	@Autowired
	private reservationService service;

	// @RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public List<Reservation> getAllReservations() {
		return service.getAllReservation();
	}

	// @RequestMapping(value = "/reservation", method = RequestMethod.POST)
	public void addReservations(@RequestBody Reservation reservation) {
		service.addReservation(reservation);
	}

}
