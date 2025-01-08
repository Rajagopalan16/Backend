package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long userId; // Unique ID for the user

    @NotBlank(message = "First name is required")
    private String firstName; // First name of the user

    @NotBlank(message = "Last name is required")
    private String lastName; // Last name of the user

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address")
    private String email; // User's email

    @NotBlank(message = "Password is required")
    private String password; // User's password
}
