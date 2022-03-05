package com.hms.searchRooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.rooms.Rooms;
import com.hms.rooms.RoomsRepository;

@Service
public class RoomService {

	@Autowired
	private RoomsRepository roomrepo;

	public List<Rooms> availablerooms() {

		// List<Rooms> list = new ArrayList<>();

		// return roomrepo.findAll().stream().map(p ->
		// p.getRoomStatus().contentEquals("Not
		// Active")).collect(Collectors.toList()).forEach(list::rooms);

		// return roomrepo.findAll().stream().map(p -> p.getRoomStatus().equals("Not
		// Active")).getClass();

		return roomrepo.findAll().stream().filter(p -> p.getRoomStatus().equals("Not Active")).toList();

	}

}
