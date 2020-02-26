package com.omnivista.object;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Device")
public class Device {
	@Id
	private String id;
	private String name;
	private Status status;
	
	enum Status {
		UP,
		DOWN,
		WARNING,
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Device(String _id, String _name, Status _status) {
		name = _name;
		id = _id;
		status = _status;
	}
	
	public Device(String _id, String _name) {
		name = _name;
		id = _id;

	}
}
