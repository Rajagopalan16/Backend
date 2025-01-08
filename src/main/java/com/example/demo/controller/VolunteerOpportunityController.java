package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.VolunteerOpportunity;
import com.example.demo.service.VolunteerOpportunityService;

import java.util.List;

@RestController
@RequestMapping("/opportunities")
public class VolunteerOpportunityController {

    @Autowired
    private VolunteerOpportunityService opportunityService;

    @GetMapping
    public ResponseEntity<List<VolunteerOpportunity>> getAllOpportunities() {
        return new ResponseEntity<>(opportunityService.getAllOpportunities(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VolunteerOpportunity> getOpportunityById(@PathVariable Long id) {
        return new ResponseEntity<>(opportunityService.getOpportunityById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VolunteerOpportunity> createOpportunity(@RequestBody VolunteerOpportunity opportunity) {
        return new ResponseEntity<>(opportunityService.saveOpportunity(opportunity), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOpportunity(@PathVariable Long id) {
        opportunityService.deleteOpportunity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
