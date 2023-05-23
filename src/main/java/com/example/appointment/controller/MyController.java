package com.example.appointment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.appointment.entity.Appointment;
import com.example.appointment.services.AP_Service;

@RestController
public class MyController {
	
	@Autowired
	private AP_Service ap_service;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping("/appointments")
	public List<Appointment> getAPs() {
		return ap_service.getAPs();
	}
	
	
	@GetMapping("/appointments/{ap_id}")
	public Appointment getAP(@PathVariable String ap_id) {
		return ap_service.getAP(Long.parseLong(ap_id));
		
	}

	@PostMapping("/appointments")
	public Appointment addAP(@RequestBody Appointment ap) {
		return ap_service.addAP(ap);
	}
	
	@PutMapping("/appointments")
	public Appointment updateAP(@RequestBody Appointment ap) {
		return ap_service.updateAP(ap);
	}
	
	@DeleteMapping("/appointments")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id) {
		try {
			ap_service.deleteAP(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
