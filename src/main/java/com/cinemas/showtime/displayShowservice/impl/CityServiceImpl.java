package com.cinemas.showtime.displayShowservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemas.showtime.displayShowservice.model.City;
import com.cinemas.showtime.displayShowservice.repository.CityRepository;
import com.cinemas.showtime.displayShowservice.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> findAll() {
		System.out.println("Service reached");
		return cityRepository.findAll();
	}
	
	

}
