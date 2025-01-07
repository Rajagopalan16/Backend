package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<VolunteerApplication> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/{id}")
    public VolunteerApplication getApplicationById(@PathVariable Long id) {
        return applicationService.getApplicationById(id);
    }

    @PostMapping
    public VolunteerApplication createApplication(@RequestBody VolunteerApplication application) {
        return applicationService.saveApplication(application);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
    }
}
