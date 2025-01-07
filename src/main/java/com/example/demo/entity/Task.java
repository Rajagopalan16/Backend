package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    private String name; // Name of the task (e.g., "Event Planning", "Logistics Support")
    private String description; // Detailed description of the task
    private boolean isCompleted; // Status of the task (true if completed)

    @ManyToOne
    @JoinColumn(name = "opportunity_id")
    private VolunteerOpportunity opportunity; // Linking the task to a volunteer opportunity

	public void setCompleted(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
