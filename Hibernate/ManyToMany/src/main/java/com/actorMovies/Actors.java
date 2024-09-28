package com.actorMovies;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="actor_data")
public class Actors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name" , nullable=false)
	private String name;
	
	@Column(name="age" , nullable=false)
	private int age;
	
	@ManyToMany(mappedBy="actors")
	private Set<Movies> movie = new HashSet<Movies>();

	public Actors(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Actors() {

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Movies> getMovie() {
		return movie;
	}

	public void setMovie(Set<Movies> movie) {
		this.movie = movie;
	}
	
	
	
}
