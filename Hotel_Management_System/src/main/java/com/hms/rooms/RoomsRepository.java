package com.hms.rooms;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends MongoRepository<Rooms, String> {

}
