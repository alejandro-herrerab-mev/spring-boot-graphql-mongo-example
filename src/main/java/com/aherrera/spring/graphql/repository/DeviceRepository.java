package com.aherrera.spring.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.aherrera.spring.graphql.model.Device;


public interface DeviceRepository extends CrudRepository<Device, String> {
    final String URI = "https://api.restful-api.dev/objects";

}
