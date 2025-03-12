package com.aherrera.spring.graphql.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.aherrera.spring.graphql.model.Device;
import com.aherrera.spring.graphql.repository.DeviceRepository;

@Controller
public class DeviceController {

    private final DeviceRepository deviceRepository;

    DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    // @QueryMapping
    // public Optional<Device> device(@Argument String id) {
    //     return deviceRepository.getForEntity(URI, Device.class, new Object());
    // }

    @QueryMapping
    public List<Device> findAllDevices() {
        return (List<Device>) deviceRepository.findAll();

    }

    // @QueryMapping
    // public Integer countTutorials() {
    //     return (int) tutorialRepository.count();
    // }

    // @MutationMapping
    // public Tutorial createTutorial(@Argument String title, @Argument String description, @Argument String author) {
    //     Tutorial tutorialResult = null;
    //     Optional<Author> authorOpt = authorRepository.findById(author);
    //     if (authorOpt.isPresent()) {
    //         Tutorial tutorial = new Tutorial(title, description, authorOpt.get());
    //         tutorialResult = tutorialRepository.save(tutorial);
    //     }
    //     return tutorialResult;
    // }

}
