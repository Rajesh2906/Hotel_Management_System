package com.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reservationService {

	@Autowired
	private repo rep;

	public List<Reservation> getAllReservation() {
		return rep.findAll();
	}

	public Reservation addReservation(Reservation reservaiton) {
		return rep.insert(reservaiton);
	}

}
