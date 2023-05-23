package com.example.appointment.dao;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.appointment.entity.Appointment;

@Repository
public interface AppointmentDao extends CrudRepository<Appointment, Long>{

}
