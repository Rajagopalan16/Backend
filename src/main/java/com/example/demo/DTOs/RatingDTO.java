package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingDTO {
    private Long ratingId;
    private Long userId; // ID of the user giving the rating
    private Long opportunityId; // ID of the opportunity being rated
    private int score; // Rating score (e.g., 1–5)
    private String comment; // Feedback comment
}
