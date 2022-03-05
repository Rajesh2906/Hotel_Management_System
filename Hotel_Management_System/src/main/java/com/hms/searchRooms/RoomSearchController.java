package com.hms.searchRooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hms.rooms.Rooms;

@RestController
//@RequestMapping("/receptionist")
public class RoomSearchController {

	@Autowired
	private RoomService roomservice;

	// @RequestMapping("/availablerooms")
	public List<Rooms> getavailablerooms() {
		return roomservice.availablerooms();
	}

}
