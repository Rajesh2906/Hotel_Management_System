package com.hms.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reservationService {

	@Autowired
	private reservationRepository rep;

	@Autowired
	Reservation reservation;

	public List<Reservation> getAllReservation() {
		return rep.findAll();
	}

	public Reservation addReservation(Reservation reservaiton) {
		reservation.setStatus_("Confirmed");
		return rep.insert(reservaiton);
	}

	/*
	 * public boolean findById(String code) { return
	 * rep.findById(res.getCode()).equals(code); }
	 */

}
