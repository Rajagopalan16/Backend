package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class VolunteerOpportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long opportunityId;

    private String title;
    private String description;
    private String causeCategory;
    private String requiredSkills;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private int slotsAvailable;

    // Getters and Setters
    // similar to the User entity, providing getter and setter methods
}
