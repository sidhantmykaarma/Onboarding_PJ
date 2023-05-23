package com.example.appointment.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	private long id;
	private String name;
	private String car;
	private String date;

	public Appointment(long id, String name, String car, String date) {
		super();
		this.id = id;
		this.name = name;
		this.car = car;
		this.date = date;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	

}
