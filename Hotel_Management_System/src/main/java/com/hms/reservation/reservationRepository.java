package com.hms.reservation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reservationRepository extends MongoRepository<Reservation, String> {

}
