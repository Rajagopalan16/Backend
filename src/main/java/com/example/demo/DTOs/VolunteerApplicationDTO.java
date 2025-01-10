package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VolunteerApplicationDTO {
    private Long applicationId; // Unique ID for the application

    @NotNull(message = "Volunteer Opportunity ID is required")
    private Long volunteerOpportunityId; // Associated volunteer opportunity ID

    @NotNull(message = "User ID is required")
    private Long userId; // User who submitted the application

    @NotBlank(message = "Status is required")
    private String status; // Status of the application (e.g., pending, approved, rejected)

	public Object getVolunteerId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOpportunityId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
}
