package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VolunteerApplicationDTO {
    private Long applicationId;
    private Long userId; // ID of the applicant
    private Long opportunityId; // ID of the opportunity applied for
    private String status; // Status of the application (e.g., "Pending", "Accepted", "Rejected")
    private String notes; // Optional notes from the applicant or admin
}
