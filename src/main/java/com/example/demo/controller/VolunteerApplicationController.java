package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.VolunteerApplication;
import com.example.demo.service.VolunteerApplicationService;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class VolunteerApplicationController {

    @Autowired
    private VolunteerApplicationService applicationService;

    @GetMapping
    public ResponseEntity<List<VolunteerApplication>> getAllApplications() {
        return new ResponseEntity<>(applicationService.getAllApplications(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VolunteerApplication> getApplicationById(@PathVariable Long id) {
        return new ResponseEntity<>(applicationService.getApplicationById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VolunteerApplication> createApplication(@RequestBody VolunteerApplication application) {
        return new ResponseEntity<>(applicationService.saveApplication(application), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
