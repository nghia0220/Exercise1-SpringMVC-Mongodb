package com.omnivista.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.omnivista.object.Device;
import com.omnivista.repository.DeviceRepository;


public class DeviceService {

	@Autowired
	private DeviceRepository repo;
	
	public List<Device> findAll() {
		return repo.findAll();
	}
	
	public Optional<Device> findById(String id) {
		return repo.findById(id);
	}
	
	public void create(Device de) {
		repo.insert(de);
	}
	
	public void update(Device de) {
		repo.save(de);
	}
	
	public void delete(Device de) {
		repo.delete(de);
	}
}
