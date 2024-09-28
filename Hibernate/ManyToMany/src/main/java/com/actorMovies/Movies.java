package com.actorMovies;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movies_data")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="imdb")
	private double imdb;
	
	@Column(name="yor")
	private int yor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(
				name = "Movies_Actor_data",
				joinColumns = {@JoinColumn(name="movie_id")},
				inverseJoinColumns= {@JoinColumn(name="actor_id")}
			)
	private Set<Actors> actors = new HashSet<Actors>();

	public Movies() {
		super();
	}

	public Movies(String name, double imdb, int yor) {
		super();
		this.name = name;
		this.imdb = imdb;
		this.yor = yor;
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

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public int getYor() {
		return yor;
	}

	public void setYor(int yor) {
		this.yor = yor;
	}

	public Set<Actors> getActors() {
		return actors;
	}

	public void setActors(Set<Actors> actors) {
		this.actors = actors;
	}
	
	
	
	
}
