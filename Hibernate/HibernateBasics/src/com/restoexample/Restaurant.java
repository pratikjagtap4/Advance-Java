package com.restoexample;

public class Restaurant {
	
	private int id;
	private String name;
	private String location;
	private String speciality;
	private int rating;
	
	
	public Restaurant(String name, String location, String speciality, int rating) {
		
		this.name = name;
		this.location = location;
		this.speciality = speciality;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
