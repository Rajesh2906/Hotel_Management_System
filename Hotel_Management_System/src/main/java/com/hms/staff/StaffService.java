package com.hms.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffrep;
	@Autowired
	private Staff staff;

	public List<Staff> getAllReservation() {
		return staffrep.findAll();
	}

	/*
	 * public Staff addReservation(Staff staff) { if (staff.getEmail()) {
	 * 
	 * return null; }
	 * 
	 * }
	 */

}
