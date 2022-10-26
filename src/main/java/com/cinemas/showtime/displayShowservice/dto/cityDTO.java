package com.cinemas.showtime.displayShowservice.dto;

import java.util.List;


public class cityDTO {

	private String id;
	private String city;
	private List<String> movies;
	
	public cityDTO() {
	}

	public cityDTO(String id, String city, List<String> movies) {
		super();
		this.id = id;
		this.city = city;
		this.movies = movies;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	
	
	
	
	

}
