package com.hms.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffrep;

	public List<Staff> getAllReservation() {
		return staffrep.findAll();
	}

	public Staff addStaff(Staff staff) {
		return staffrep.insert(staff);
	}

}
