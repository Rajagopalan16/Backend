package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VolunteerOpportunityDTO {
    private Long opportunityId;
    private String name; // Name of the opportunity
    private String description; // Description of the opportunity
    private String location; // Location of the opportunity
    private String startDate; // Start date
    private String endDate; // End date
    private Long organizationId; // ID of the hosting organization
    private List<TaskDTO> tasks; // List of related tasks
    private List<SkillDTO> requiredSkills; // List of required skills
}
