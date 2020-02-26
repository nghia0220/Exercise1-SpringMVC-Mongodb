package com.omnivista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.omnivista.object.Device;


public interface DeviceRepository extends MongoRepository<Device, String> {

}
