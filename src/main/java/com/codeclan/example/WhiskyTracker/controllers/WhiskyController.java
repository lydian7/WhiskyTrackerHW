package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity getWhiskies(){
        return new ResponseEntity(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/year")
    public ResponseEntity getWhiskiesByYear(
            @RequestParam(name="year") int year
    ){
        return new ResponseEntity(whiskyRepository.findByYear(year), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/distillery")
    public ResponseEntity getWhiskiesByDistilleryAndAge(
        @RequestParam(name="age") int age,
        @RequestParam(name="id") Long id
    ){
        return new ResponseEntity(whiskyRepository.findByAgeAndDistilleryId(age, id), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/region")
    public ResponseEntity getWhiskiesByRegion(
            @RequestParam(name="region") String region
    ){
        return new ResponseEntity(whiskyRepository.findByDistilleryRegion(region), HttpStatus.OK);
    }


}
