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

public class RatingDTO {
    private Long ratingId; // Unique ID for the rating

    @NotBlank(message = "Rating value is required")
    private Integer ratingValue; // Rating value (e.g., 1-5)

    @NotBlank(message = "Feedback is required")
    private String feedback; // Feedback for the rating

    @NotBlank(message = "User ID is required")
    private Long userId; // ID of the user providing the rating

    @NotBlank(message = "Organization ID is required")
    private Long organizationId; // ID of the organization being rated

	public Object getRatingValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFeedback() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOrganizationId() {
		// TODO Auto-generated method stub
		return null;
	}
}
