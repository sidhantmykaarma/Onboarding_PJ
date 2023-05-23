package com.example.appointment.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.appointment.dao.AppointmentDao;
import com.example.appointment.entity.Appointment;

@Service
public class Ap_serviceimpl implements AP_Service{
	
	@Autowired
	private AppointmentDao APDao;
	
//	List<Appointment> list;

	public Ap_serviceimpl() {
//		list = new ArrayList<>();
//		list.add(new Appointment(12, "Sam", "Sedan"));
//		list.add(new Appointment(13, "Dominic", "Celerio"));
	}

	@Override
	public List<Appointment> getAPs() {
		return APDao.findAll();
	}
	
	public Appointment getAP(long id) {
		return APDao.getOne(id);
	}
	
	public Appointment addAP(Appointment ap) {
		APDao.save(ap);
		return ap;
	}
	
	public Appointment updateAP(Appointment ap) {
		APDao.save(ap);
		return ap;
	}
	
	public void deleteAP(long id) {
//		list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
		Appointment ap = APDao.getOne(id);
		APDao.delete(ap);
	}

}
