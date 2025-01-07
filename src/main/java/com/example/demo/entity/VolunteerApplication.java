package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;


@Getter
@Setter
@Entity
public class VolunteerApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    private Long userId;
    private Long opportunityId;
    private LocalDate applicationDate;
    private String status;

}
