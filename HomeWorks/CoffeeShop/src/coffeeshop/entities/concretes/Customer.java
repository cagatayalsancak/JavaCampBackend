package coffeeshop.entities.concretes;

import java.util.Date;

import coffeeshop.entities.abstracts.Entity;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String surName;
	private Date dateOfBirth;
	private String NationalIdentity;
	
	
	public Customer() {
		
	}


	public Customer(int id, String firstName, String surName, Date dateOfBirth, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		NationalIdentity = nationalIdentity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalIdentity() {
		return NationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	
	
	
	
	
	
	
}
