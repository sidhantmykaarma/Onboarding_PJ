package com.example.appointment.services;

import java.util.List;

import com.example.appointment.entity.Appointment;

public interface AP_Service {
	public List<Appointment> getAPs();
	public Appointment getAP(long id);
	public Appointment addAP(Appointment ap);
	public Appointment updateAP(Appointment ap);
	public void deleteAP(long id);

}
