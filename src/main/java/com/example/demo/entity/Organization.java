package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long organizationId;

    private String name;
    private String description;
    private String contactPerson;
    private String email;
    private String phone;
    private String address;
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}
	public void setContactEmail(Object contactEmail) {
		// TODO Auto-generated method stub
		
	}

}