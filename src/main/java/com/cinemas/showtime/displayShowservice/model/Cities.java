package com.cinemas.showtime.displayShowservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Cities {
	

	@Id
	private String city_id;
	private String city_name;
	private List<String> movies;
	public Cities(String city_id, String city_name, List<String> movies) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.movies = movies;
	}
	
	
	public Cities() {
		
	}


	public String getCity_id() {
		return city_id;
	}


	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}


	public String getCity_name() {
		return city_name;
	}


	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}


	public List<String> getMovies() {
		return movies;
	}


	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	
	

}
