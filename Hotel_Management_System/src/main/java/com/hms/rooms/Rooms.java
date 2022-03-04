package com.hms.rooms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Rooms")
public class Rooms {

	@Id
	private String roomNo;
	private String roomStatus;
	private Long totalRooms;

	public Rooms() {
	}

	public Rooms(String roomNo, String roomStatus, Long totalRooms) {
		super();
		this.roomNo = roomNo;
		this.roomStatus = roomStatus;
		this.totalRooms = totalRooms;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Long getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(Long totalRooms) {
		this.totalRooms = totalRooms;
	}

}
