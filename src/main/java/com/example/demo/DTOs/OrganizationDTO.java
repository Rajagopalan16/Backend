package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NotBlank
public class OrganizationDTO {
    private Long organizationId; // Unique ID for the organization

    @NotBlank(message = "Name is required")
    private String name; // Name of the organization

    @NotBlank(message = "Description is required")
    private String description; // Brief description of the organization

    @NotBlank(message = "Contact Email is required")
    private String contactEmail; // Contact email for the organization
}

