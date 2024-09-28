package com.passport;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="pass_id" , unique=true)
	private Passport passport;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="driving_lic" , unique=true)
	private DrivingLic driveLic;
	
	
	public Person(String name, String address, Passport passport ,  DrivingLic driveLic ) {
		this.name = name;
		this.address = address;
		this.passport = passport;
		this.driveLic = driveLic;
	}

	public Person() {

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public DrivingLic getDriveLic() {
		return driveLic;
	}

	public void setDriveLic(DrivingLic driveLic) {
		this.driveLic = driveLic;
	}
	
	
	
	
	
	
}
