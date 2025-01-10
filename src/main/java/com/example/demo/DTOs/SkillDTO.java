package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillDTO {
    private Long skillId; // Unique ID for the skill

    @NotBlank(message = "Skill name is required")
    private String name; // Name of the skill

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
