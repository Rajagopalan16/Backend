package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    private String name; // Name of the skill (e.g., "Public Speaking", "First Aid")
    private String description; // Detailed description of the skill

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Linking skill to a specific user
}
