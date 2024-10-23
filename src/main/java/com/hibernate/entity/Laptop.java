package com.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lap_id;
	
	private String lap_name;
	
	@ManyToOne
	private Student stu;

	public int getLap_id() {
		return lap_id;
	}

	public void setLap_id(int lap_id) {
		this.lap_id = lap_id;
	}

	public String getLap_name() {
		return lap_name;
	}

	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}
	

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Laptop [lap_id=" + lap_id + ", lap_name=" + lap_name + ", stu=" + stu + "]";
	}


   

	
	
}
