package com.hms.searchRooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.guest.GuestRepository;

@Service
public class RoomService {

	@Autowired
	private GuestRepository guestrepo;

	public void updateRooms(String guestMemberCode) {
		Long noofguests = guestrepo.count();

	}

}
