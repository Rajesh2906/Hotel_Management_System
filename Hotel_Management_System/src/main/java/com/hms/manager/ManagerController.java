package com.hms.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.rooms.Rooms;
import com.hms.rooms.RoomsController;
import com.hms.setRates.RateController;
import com.hms.setRates.Rates;
import com.hms.staff.Staff;
import com.hms.staff.StaffController;

@RestController
@RequestMapping("/Manager")
public class ManagerController {

	// RoomsController Access

	@Autowired
	RoomsController roomscontroller;

	@RequestMapping(value = "/RoomsController/Rooms", method = RequestMethod.GET)
	public List<Rooms> getAllRoomsData() {
		return roomscontroller.getAllRoomsData();

	}

	@RequestMapping(value = "/RoomsController/UpdateRooms", method = RequestMethod.PUT)
	public void updateTotalRooms(@RequestBody Rooms rooms) {
		roomscontroller.updateTotalRooms(rooms);
	}

	@RequestMapping(value = "/RoomsController/AddRooms", method = RequestMethod.POST)
	public void addTotalRooms(@RequestBody Rooms rooms) {
		roomscontroller.addTotalRooms(rooms);
	}

	// SetRates Controller Access

	@Autowired
	RateController ratecontroller;

	@RequestMapping(value = "/SetRatesController/SetRate", method = RequestMethod.POST)
	public void setRates(@RequestBody Rates rate) {
		ratecontroller.setRates(rate);
	}

	@RequestMapping(value = "/SetRatesController/GetAllrates", method = RequestMethod.GET)
	public List<Rates> getRates() {
		return ratecontroller.getRates();
	}

	@RequestMapping(value = "/SetRatesController/UpdateRatesWithId/{Id}", method = RequestMethod.PUT)
	public void updateRates(Rates rates, @PathVariable("Id") String id) {
		ratecontroller.updateRates(rates, id);
	}

	// Staff Controller Access

	@Autowired
	StaffController staffcontroller;

	@RequestMapping(value = "/staffController/GetAllStaff", method = RequestMethod.GET)
	public List<Staff> getAllStaff() {
		return staffcontroller.getAllStaff();
	}

	@RequestMapping(value = "/staffController/AddStaff", method = RequestMethod.POST)
	public Staff addStaff(@RequestBody Staff staff) {
		return staffcontroller.addStaff(staff);
	}

	@RequestMapping(value = "/staffController/{staffCode}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("staffCode") String staffCode) {
		staffcontroller.deleteById(staffCode);
	}

	@RequestMapping(value = "/staffController/UpdateStaff", method = RequestMethod.PUT)
	public Staff updateById(@RequestBody Staff staffCode) {
		return staffcontroller.updateById(staffCode);
	}

	@RequestMapping(value = "/staffController/{staffCode}", method = RequestMethod.GET)
	public Staff getStaffById(@PathVariable("staffCode") String staffCode) {
		return staffcontroller.getStaffById(staffCode);
	}

}
