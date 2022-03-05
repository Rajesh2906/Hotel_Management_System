package com.hms.rooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/manager")
public class RoomsController {

	@Autowired
	private RoomsService roomservice;

	// @RequestMapping("/Rooms")
	public List<Rooms> getAllRoomsData() {
		return roomservice.getAllRooms();

	}

	// @RequestMapping(value = "/updateRooms", method = RequestMethod.PUT)
	public void updateTotalRooms(@RequestBody Rooms rooms) {
		roomservice.updateNoofRooms(rooms);
	}

	// @RequestMapping(value = "/addRooms", method = RequestMethod.POST)
	public void addTotalRooms(@RequestBody Rooms rooms) {
		roomservice.addNoofRooms(rooms);
	}

}
