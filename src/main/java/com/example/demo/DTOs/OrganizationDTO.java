package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationDTO {
    private Long organizationId;
    private String name;
    private String description;
    private String contactEmail;
    private String contactPhone;
}
