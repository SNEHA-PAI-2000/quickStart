package com.example.demo.services;

import com.example.demo.entity.Doctor;
import com.example.demo.ifaces.DoctorRepository;

public class DoctorService {

	DoctorRepository repo;
	public Doctor add(Doctor entity) {
		return this.repo.save(entity);
	}
	
	public Doctor findById(int id) {
		return this.repo.findById(id).orElseThrow(() -> new ElementNotFoundException("ERR-102 ","Element not found"));
	}
}

