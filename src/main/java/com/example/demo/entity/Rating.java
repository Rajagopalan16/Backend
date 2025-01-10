package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // User providing the rating

    @ManyToOne
    @JoinColumn(name = "opportunity_id")
    private VolunteerOpportunity opportunity; // Volunteer opportunity being rated

    private int score; // Rating score (e.g., 1 to 5)
    private String comment; // Optional comment for additional feedback
	public void setRatingValue(Object ratingValue) {
		// TODO Auto-generated method stub
		
	}
	public void setRatingValue1(Object ratingValue) {
		// TODO Auto-generated method stub
		
	}
	public void setFeedback(Object feedback) {
		// TODO Auto-generated method stub
		
	}
	public void setUserId(Object userId) {
		// TODO Auto-generated method stub
		
	}
	public void setOrganizationId(Object organizationId) {
		// TODO Auto-generated method stub
		
	}
}
