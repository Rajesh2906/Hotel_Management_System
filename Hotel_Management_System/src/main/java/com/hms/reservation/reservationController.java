package com.hms.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reception")
public class reservationController {

	@Autowired
	private reservationService service;

	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public List<Reservation> getAllReservations() {
		return service.getAllReservation();
	}

	@RequestMapping(value = "/reservation", method = RequestMethod.POST)
	public void addReservations(@RequestBody Reservation reservation) {
		service.addReservation(reservation);
	}

}
