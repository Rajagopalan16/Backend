package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.VolunteerApplication;
import com.example.demo.repository.VolunteerApplicationRepository;

import java.util.List;

@Service
public class VolunteerApplicationService {

    @Autowired
    private VolunteerApplicationRepository applicationRepository;

    public List<VolunteerApplication> getAllApplications() {
        return applicationRepository.findAll();
    }

    public VolunteerApplication getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public VolunteerApplication saveApplication(VolunteerApplication application) {
        return applicationRepository.save(application);
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}

