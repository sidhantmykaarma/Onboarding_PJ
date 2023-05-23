package com.example.appointment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appointment.entity.Appointment;

public interface AppointmentDao extends JpaRepository<Appointment, Long>{

}
