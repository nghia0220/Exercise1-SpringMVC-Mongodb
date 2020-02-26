package com.omnivista.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omnivista.object.Device;
import com.omnivista.service.DeviceService;

@RestController
public class DeviceController {
	
//	@Autowired
//	private DeviceService service;
	
	@PostMapping("/device")
	public ResponseEntity<String> Craete(@RequestBody Device device){
		//service.create(device);
		//return ResponseEntity.ok().body(this.service.update(device));
		return new ResponseEntity<String>("Create device successful!", HttpStatus.OK);
	}
	
	@GetMapping("/device")
	public List<Device> GetAll() {
		//return new Device("a", "b");
		//return service.findAll();
		return null;
	}

	@GetMapping("/device/{id}")
	public Optional<Device> GetById(@PathVariable("id") String id) {
		//return service.findById(id);
		return null;
	}
	
	@PutMapping("/device")
	void UpdateDevice(@RequestBody Device device) {
		
		
	}
	
	@DeleteMapping("/device")
	void DeleteDevice(@RequestBody Device device) {
		
	}
}
