package com.hms.rooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class RoomsController {

	@Autowired
	private RoomsService roomservice;

	@RequestMapping("/Rooms")
	public List<Rooms> getAllRoomsData() {
		return roomservice.getAllRooms();

	}

	@RequestMapping(value = "/{roomNo}", method = RequestMethod.PUT)
	public void updateTotalRooms(Rooms rooms, @PathVariable("roomNo") String roomNo) {
		roomservice.updateNoofRooms(rooms);
	}

	@RequestMapping(value = "/addRooms", method = RequestMethod.POST)
	public void addTotalRooms(@RequestBody Rooms rooms) {
		roomservice.addNoofRooms(rooms);
	}

}
