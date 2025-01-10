package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    private String name; // Name of the skill (e.g., "Public Speaking", "First Aid")
    private String description; // Detailed description of the skill

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Linking skill to a specific user

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}
}
