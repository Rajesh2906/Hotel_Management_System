package com.hms.searchRooms;

//@Document(collection = "Serach Room")
public class Room {

	private String period;
	private Long availableRooms;

	public Room() {

	}

	public Room(String period, Long availableRooms) {
		super();
		this.period = period;
		this.availableRooms = availableRooms;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(Long availableRooms) {
		this.availableRooms = availableRooms;
	}

}
