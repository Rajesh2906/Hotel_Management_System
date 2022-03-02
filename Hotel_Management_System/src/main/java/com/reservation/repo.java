package com.reservation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends MongoRepository<Reservation, String> {

}
