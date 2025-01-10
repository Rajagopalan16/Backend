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
public class VolunteerOpportunityDTO {
    private Long opportunityId; // Unique ID for the opportunity

    @NotBlank(message = "Opportunity name is required")
    private String name; // Name of the opportunity

    @NotBlank(message = "Opportunity description is required")
    private String description; // Description of the opportunity

    @NotNull(message = "Organization ID is required")
    private Long organizationId; // Associated organization ID

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOrganizationId() {
		// TODO Auto-generated method stub
		return null;
	}
}
