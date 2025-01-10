package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTOs.VolunteerApplicationDTO;
import com.example.demo.entity.VolunteerApplication;
import com.example.demo.service.VolunteerApplicationService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/volunteer-applications")
public class VolunteerApplicationController {

    @Autowired
    private VolunteerApplicationService applicationService;

    @GetMapping
    public ResponseEntity<List<VolunteerApplication>> getAllApplications() {
        return new ResponseEntity<>(applicationService.getAllApplications(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VolunteerApplication> createApplication(@Valid @RequestBody VolunteerApplicationDTO applicationDto) {
        VolunteerApplication application = new VolunteerApplication();
        application.setVolunteerId(applicationDto.getVolunteerId());
        application.setOpportunityId(applicationDto.getOpportunityId());
        application.setStatus(applicationDto.getStatus());

        return new ResponseEntity<>(applicationService.saveApplication(application), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VolunteerApplication> updateApplication(@PathVariable Long id, @Valid @RequestBody VolunteerApplicationDTO applicationDto) {
        VolunteerApplication application = applicationService.getApplicationById(id);
        application.setVolunteerId(applicationDto.getVolunteerId());
        application.setOpportunityId(applicationDto.getOpportunityId());
        application.setStatus(applicationDto.getStatus());

        return new ResponseEntity<>(applicationService.saveApplication(application), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
