package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class VolunteerApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    private Long userId;
    private Long opportunityId;
    private LocalDate applicationDate;
    private String status;
	public void setVolunteerId(Object volunteerId) {
		// TODO Auto-generated method stub
		
	}
	public void setOpportunityId(Object opportunityId2) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(Object status2) {
		// TODO Auto-generated method stub
		
	}

}
