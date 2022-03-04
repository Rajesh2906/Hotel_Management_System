package com.hms.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.reservation.reservationRepository;
import com.hms.reservation.reservationService;
import com.hms.rooms.Rooms;
import com.hms.rooms.RoomsRepository;

@Service
public class GuestService {
	@Autowired
	Guest guest;
	@Autowired
	private reservationRepository resrepo;
	@Autowired
	private GuestRepository repo;
	@Autowired
	reservationService ser;
	@Autowired
	RoomsRepository roomsrepo;

	/*
	 * Date currentDate = new Date(); SimpleDateFormat dateFormat = new
	 * SimpleDateFormat("dd/mm/yyyy"); String dateOnly =
	 * dateFormat.format(currentDate);
	 */

	public Guest addifGuest(String code, Guest guest, String roomNo) {
		if (resrepo.existsById(code)) {

			Rooms myDocumentToUpdateactive = roomsrepo.findById(roomNo).get();
			myDocumentToUpdateactive.setRoomStatus("Active");
			roomsrepo.save(myDocumentToUpdateactive);

			guest.setReserveCode(code);
			guest.setRoomNo(roomNo);
			guest.setGuestStatus("Checked In");
			return repo.insert(guest);

		} else {
			return null;
		}

	}

	public void removeGuest(String code, String roomNo, String todaydate, String membercode) {

		if (resrepo.findById(code).get().getCheckout().equals(todaydate)) {

			Rooms myDocumentToUpdatenotactive = roomsrepo.findById(roomNo).get();
			myDocumentToUpdatenotactive.setRoomStatus("Not Active");
			roomsrepo.save(myDocumentToUpdatenotactive);

			Guest guestToUpdatenotactive = repo.findById(membercode).get();
			guestToUpdatenotactive.setGuestStatus("Checked Out");
			repo.save(guestToUpdatenotactive);

		}
	}

	public List<Guest> getAllGuest() {
		return repo.findAll();
	}

}
