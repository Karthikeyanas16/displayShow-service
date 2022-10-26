package com.cinemas.showtime.displayShowservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;
import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.showtime.displayShowservice.impl.CityServiceImpl;
import com.cinemas.showtime.displayShowservice.model.City;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoIterable;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

@RestController
public class CityController {
	
	@Autowired
	public CityServiceImpl cityServiceImpl;
	
	@GetMapping(value = "/city")
	public  ResponseEntity<?>  getAllCities() throws JSONException, JsonMappingException, JsonProcessingException {
		System.out.println("controller reached");
		List<City> cityArray=cityServiceImpl.findAll();
		System.out.println("list-->"+cityArray);
		
		Gson gson = new Gson();
		JSONArray jsonArray=new JSONArray();
		
		String jsonStr = new Gson().toJson(cityArray);
		
		System.out.println("jsonStr-->"+jsonStr);

		for(City cityarr:cityArray){
			String jsonString=new Gson().toJson(cityarr);
			String jsontmp1=jsonString.replace("\"{", "{");
			String jsontmp2=jsontmp1.replace("}\"", "}");
			String json = jsontmp2.replace("[", "").replace("]", "");
			String escapedString = StringEscapeUtils.unescapeJava(json);
			System.out.println("escapedString-->"+escapedString);
			JSONObject jsonObject = new JSONObject(escapedString);
			jsonArray.put(jsonObject);
		}
		
		
		System.out.println("JSONArray -->"+jsonArray);
		//return jsonArray;
		//return cityServiceImpl.findAll();	
		//return ResponseEntity.ok().body(cityServiceImpl.findAll());
		
		 return ResponseEntity.status(HttpStatus.OK).body(jsonArray.toString());
	}

}
