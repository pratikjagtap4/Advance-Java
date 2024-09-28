package com.passport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="licence")
public class DrivingLic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int d_id;
	
	@Column(name="licenceNumber")
	private String licenceNumber;
	
	@Column(name="state")
	private String state;
	
	@OneToOne(mappedBy="driveLic")
	private Person person;
	
	
	public DrivingLic() {
		
	}
	
	
	public DrivingLic(String licenceNumber, String state , Person person) {

		this.licenceNumber = licenceNumber;
		this.state=state;
		this.person = person;
	}
	
	
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
}
