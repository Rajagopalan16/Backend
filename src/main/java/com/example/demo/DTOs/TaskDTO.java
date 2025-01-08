package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private Long taskId; // Unique ID for the task

    @NotBlank(message = "Task name is required")
    private String name; // Name of the task

    @NotBlank(message = "Task description is required")
    private String description; // Description of the task

    @NotNull(message = "Volunteer Opportunity ID is required")
    private Long volunteerOpportunityId; // Associated volunteer opportunity ID
}
