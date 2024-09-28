package com.passport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	
	@Column(name="p_identification")
	private String p_identification;
	
	@OneToOne(mappedBy = "passport")
	private Person person;
	
	
	public Passport(String p_identification, Person person) {
		this.p_identification = p_identification;
		this.person = person;
	}

	

	public Passport() {
		
	}



	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public String getP_identification() {
		return p_identification;
	}


	public void setP_identification(String p_identification) {
		this.p_identification = p_identification;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
