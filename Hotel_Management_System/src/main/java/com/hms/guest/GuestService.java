package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hms.reservation.reservationRepository;
import com.hms.reservation.reservationService;

@Service
public class GuestService {

	@Autowired
	private reservationRepository resrepo;
	@Autowired
	private GuestRepository repo;
	@Autowired
	reservationService ser;

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public Guest addifGuest(String code, Guest guest) {
		if (resrepo.existsById(code)) {
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
