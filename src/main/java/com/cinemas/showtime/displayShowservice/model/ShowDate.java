package com.cinemas.showtime.displayShowservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ShowDate {
	
	@Id
	private String show_date_id;
	private String show_date;
	private List<String> show_time;
	public ShowDate(String show_date_id, String show_date, List<String> show_time) {
		super();
		this.show_date_id = show_date_id;
		this.show_date = show_date;
		this.show_time = show_time;
	}
	
	public ShowDate() {
		
	}

	public String getShow_date_id() {
		return show_date_id;
	}

	public void setShow_date_id(String show_date_id) {
		this.show_date_id = show_date_id;
	}

	public String getShow_date() {
		return show_date;
	}

	public void setShow_date(String show_date) {
		this.show_date = show_date;
	}

	public List<String> getShow_time() {
		return show_time;
	}

	public void setShow_time(List<String> show_time) {
		this.show_time = show_time;
	}
	
	
	
	

}
