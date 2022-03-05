package com.hms.rooms;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Rooms")
public class Rooms {

	@Id
	private String roomNo;
	private String roomStatus_;
	private Long totalRooms;

	public Rooms() {
	}

	public Rooms(String roomNo, String roomStatus_, Long totalRooms) {
		super();
		this.roomNo = roomNo;
		this.roomStatus_ = roomStatus_;
		this.totalRooms = totalRooms;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomStatus_() {
		return roomStatus_;
	}

	public void setRoomStatus_(String roomStatus_) {
		this.roomStatus_ = roomStatus_;
	}

	public Long getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(Long totalRooms) {
		this.totalRooms = totalRooms;
	}

}
