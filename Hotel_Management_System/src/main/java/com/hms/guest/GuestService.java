package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.reservation.reservationRepository;
import com.hms.reservation.reservationService;

@Service
public class GuestService {

	@Autowired
	private Guest guest;
	@Autowired
	private reservationRepository resrepo;
	@Autowired
	private GuestRepository repo;
	@Autowired
	reservationService ser;

	public Guest addifGuest(String code, Guest guest) {
		if (resrepo.existsById(code)) {
			guest.setReserveCode(code);
			return repo.insert(guest);

		}
		return null;
	}

	/*
	 * public Guest addGuest(Guest guest) { return repo.insert(guest); }
	 */

	public List<Guest> getAllGuest() {
		return repo.findAll();
	}

}
