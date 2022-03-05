package com.hms.searchRooms;

//@Document(collection = "Serach Room")
public class Room {

	private String period;
	private Long availableRooms_;

	public Room() {

	}

	public Room(String period, Long availableRooms_) {
		super();
		this.period = period;
		this.availableRooms_ = availableRooms_;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getAvailableRooms_() {
		return availableRooms_;
	}

	public void setAvailableRooms_(Long availableRooms_) {
		this.availableRooms_ = availableRooms_;
	}

}
