package com.cinemas.showtime.displayShowservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="city")
public class City {
	
	@Id
	private String id;
	private String city;
	private List<String> cities;
	private List<String> movies;
	
	
	
	public City() {
		
	}


	public City(String id, String city, List<String> cities, List<String> movies) {
		super();
		this.id = id;
		this.city = city;
		this.cities = cities;
		this.movies = movies;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getMovies() {
		return movies;
	}
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", city=" + cities + ", movies=" + movies + "]";
	}

}
