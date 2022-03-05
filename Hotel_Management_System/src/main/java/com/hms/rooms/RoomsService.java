package com.hms.rooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomsService {
	@Autowired
	Rooms rooms;

	@Autowired
	private RoomsRepository roomrepo;

	public List<Rooms> getAllRooms() {

		return roomrepo.findAll();
	}

	public Rooms addNoofRooms(Rooms rooms) {

		rooms.setRoomStatus("Not Active");

		return roomrepo.insert(rooms);
	}

	public void updateNoofRooms(Rooms rooms) {

		roomrepo.save(rooms);
	}

}
