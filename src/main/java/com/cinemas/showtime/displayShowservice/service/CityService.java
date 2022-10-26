package com.cinemas.showtime.displayShowservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinemas.showtime.displayShowservice.model.City;


public interface CityService {
	
	List<City> findAll();

}
