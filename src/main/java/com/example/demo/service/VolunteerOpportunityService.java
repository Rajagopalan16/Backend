package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.VolunteerOpportunity;
import com.example.demo.repository.VolunteerOpportunityRepository;

import java.util.List;

@Service
public class VolunteerOpportunityService {

    @Autowired
    private VolunteerOpportunityRepository opportunityRepository;

    public List<VolunteerOpportunity> getAllOpportunities() {
        return opportunityRepository.findAll();
    }

    public VolunteerOpportunity getOpportunityById(Long id) {
        return opportunityRepository.findById(id).orElse(null);
    }

    public VolunteerOpportunity saveOpportunity(VolunteerOpportunity opportunity) {
        return opportunityRepository.save(opportunity);
    }

    public void deleteOpportunity(Long id) {
        opportunityRepository.deleteById(id);
    }
}
