package com.cinemas.showtime.displayShowservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movies")
public class Movies {
	
	@Id
	private String movie_id;
	private String movie_name;
	private List<String> theatres;
	public Movies(String movie_id, String movie_name, List<String> theatres) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.theatres = theatres;
	}

	public Movies() {
		
	}

	public String getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public List<String> getTheatres() {
		return theatres;
	}

	public void setTheatres(List<String> theatres) {
		this.theatres = theatres;
	}
	
	
	
}
