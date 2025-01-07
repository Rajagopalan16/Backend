package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
    private Long taskId;
    private String name; // Task name
    private String description; // Task description
    private boolean isCompleted; // Status of task
    private Long opportunityId; // ID of the related opportunity
}
