package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.reservation.reservationRepository;
import com.hms.reservation.reservationService;
import com.hms.rooms.RoomsRepository;

@Service
public class GuestService {

	@Autowired
	private reservationRepository resrepo;
	@Autowired
	private GuestRepository repo;
	@Autowired
	reservationService ser;
	@Autowired
	RoomsRepository roomsrepo;

	/*
	 * @Autowired private RoomsController roomscontroller;
	 */

	public Guest addifGuest(String code, Guest guest, String roomNo) {
		if (resrepo.existsById(code)) {

			// roomscontroller.updateTotalRooms(roomsrepo.findById(roomNo).get(), roomNo);

			guest.setReserveCode(code);
			guest.setRoomNo(roomNo);

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
