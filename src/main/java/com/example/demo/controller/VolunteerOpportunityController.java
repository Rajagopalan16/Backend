package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTOs.VolunteerOpportunityDTO;
import com.example.demo.entity.VolunteerOpportunity;
import com.example.demo.service.VolunteerOpportunityService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/volunteer-opportunities")
public class VolunteerOpportunityController {

    @Autowired
    private VolunteerOpportunityService opportunityService;

    @GetMapping
    public ResponseEntity<List<VolunteerOpportunity>> getAllOpportunities() {
        return new ResponseEntity<>(opportunityService.getAllOpportunities(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VolunteerOpportunity> createOpportunity(@Valid @RequestBody VolunteerOpportunityDTO opportunityDto) {
        VolunteerOpportunity opportunity = new VolunteerOpportunity();
        opportunity.setName(opportunityDto.getName());
        opportunity.setDescription(opportunityDto.getDescription());
        opportunity.setOrganizationId(opportunityDto.getOrganizationId());

        return new ResponseEntity<>(opportunityService.saveOpportunity(opportunity), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VolunteerOpportunity> updateOpportunity(@PathVariable Long id, @Valid @RequestBody VolunteerOpportunityDTO opportunityDto) {
        VolunteerOpportunity opportunity = opportunityService.getOpportunityById(id);
        opportunity.setName(opportunityDto.getName());
        opportunity.setDescription(opportunityDto.getDescription());
        opportunity.setOrganizationId(opportunityDto.getOrganizationId());

        return new ResponseEntity<>(opportunityService.saveOpportunity(opportunity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOpportunity(@PathVariable Long id) {
        opportunityService.deleteOpportunity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
