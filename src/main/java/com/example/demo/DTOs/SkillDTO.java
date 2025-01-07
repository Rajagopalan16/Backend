package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkillDTO {
    private Long skillId;
    private String name; // Name of the skill (e.g., "Project Management")
    private String description; // Description of the skill
}
