package com.hms.rooms;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Room")
public class Room {
	private String period;
	private Date checkIn;
	private Date checkOut;

}
