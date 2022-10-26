package com.cinemas.showtime.displayShowservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinemas.showtime.displayShowservice.model.City;

public interface CityRepository extends MongoRepository<City, String> {

}
