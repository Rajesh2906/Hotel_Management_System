package com.hms.guest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hms.reservation.reservationRepository;
import com.hms.reservation.reservationService;
import com.hms.rooms.Rooms;
import com.hms.rooms.RoomsRepository;

import io.swagger.annotations.ApiModelProperty;

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

	@ApiModelProperty(required = true, dataType = "org.joda.time.LocalDate")
	@JsonFormat(pattern = "yyyy/MM/dd")
	LocalDate currentDate = LocalDate.now();
	/*
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd"); String
	 * dateOnly = dateFormat.format(currentDate);
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

	public void removeGuest(String code, String roomNo, String membercode) /* throws ParseException */ {
		/*
		 * SimpleDateFormat sdformat = new SimpleDateFormat("yyyy/MM/dd"); Date d1 =
		 * sdformat.parse(DateOfLeaving);
		 * 
		 * if (d1.compareTo(resrepo.findById(code).get().getCheckout()) == 0) {
		 */

		Rooms myDocumentToUpdatenotactive = roomsrepo.findById(roomNo).get();
		myDocumentToUpdatenotactive.setRoomStatus("Not Active");
		roomsrepo.save(myDocumentToUpdatenotactive);

		Guest guestToUpdatenotactive = repo.findById(membercode).get();
		guestToUpdatenotactive.setGuestStatus("Checked Out");
		repo.save(guestToUpdatenotactive);

		// }
	}

	public List<Guest> getAllGuest() {
		return repo.findAll();
	}

}
