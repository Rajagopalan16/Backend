package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<VolunteerOpportunity> getAllOpportunities() {
        return opportunityService.getAllOpportunities();
    }

    @GetMapping("/{id}")
    public VolunteerOpportunity getOpportunityById(@PathVariable Long id) {
        return opportunityService.getOpportunityById(id);
    }

    @PostMapping
    public VolunteerOpportunity createOpportunity(@RequestBody VolunteerOpportunity opportunity) {
        return opportunityService.saveOpportunity(opportunity);
    }

    @DeleteMapping("/{id}")
    public void deleteOpportunity(@PathVariable Long id) {
        opportunityService.deleteOpportunity(id);
    }
}
