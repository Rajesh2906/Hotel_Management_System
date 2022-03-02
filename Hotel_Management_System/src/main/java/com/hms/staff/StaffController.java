package com.hms.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class StaffController {
	@Autowired
	private StaffService staffservice;

	@RequestMapping("/staff")
	public List<Staff> getAllStaff() {
		return staffservice.getAllReservation();
	}

	@RequestMapping(value = "/staff", method = RequestMethod.POST)
	public Staff addStaff(@RequestBody Staff staff) {
		return staffservice.addStaff(staff);
	}

}
