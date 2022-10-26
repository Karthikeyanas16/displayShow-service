package com.cinemas.showtime.displayShowservice.model;

import org.springframework.data.annotation.Id;

public class ShowTime {
	
	@Id
	private String show_time_id;
	private String show_time;
	public String getShow_time_id() {
		return show_time_id;
	}
	public void setShow_time_id(String show_time_id) {
		this.show_time_id = show_time_id;
	}
	public String getShow_time() {
		return show_time;
	}
	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}
	public ShowTime(String show_time_id, String show_time) {
		super();
		this.show_time_id = show_time_id;
		this.show_time = show_time;
	}
	
	public ShowTime() {
		
	}

}
