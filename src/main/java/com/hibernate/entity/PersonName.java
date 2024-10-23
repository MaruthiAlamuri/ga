package com.hibernate.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonName {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public PersonName() {
		System.out.println("PersonNames....");
	}
	
	@Override
	public String toString() {
		return "PersonName [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
