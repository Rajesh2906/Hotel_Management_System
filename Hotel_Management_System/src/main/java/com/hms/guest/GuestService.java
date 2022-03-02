package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	/*
	 * public Guest addGuest(String code, Guest guest) { if
	 * (resrepo.findById(code).equals(repo.findById(code))) { return
	 * repo.insert(guest);
	 * 
	 * } return null; }
	 */

	public Guest addGuest(Guest guest) {
		return repo.insert(guest);
	}

	public List<Guest> getAllGuest() {
		return repo.findAll();
	}

}
