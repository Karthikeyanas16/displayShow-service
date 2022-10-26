package com.cinemas.showtime.displayShowservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Theatre")
public class Theatres {
	
	@Id
	private String theatre_id;
	private String theatre_name;
	private List<String> show_date;
	public Theatres(String theatre_id, String theatre_name, List<String> show_date) {
		super();
		this.theatre_id = theatre_id;
		this.theatre_name = theatre_name;
		this.show_date = show_date;
	}
	
	public Theatres() {
		
	}

	public String getTheatre_id() {
		return theatre_id;
	}

	public void setTheatre_id(String theatre_id) {
		this.theatre_id = theatre_id;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public List<String> getShow_date() {
		return show_date;
	}

	public void setShow_date(List<String> show_date) {
		this.show_date = show_date;
	}
	
	

}
