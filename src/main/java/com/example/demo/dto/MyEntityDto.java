package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class MyEntityDto {

    

   

    private Long id;

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be blank")
    @JsonProperty("name")
    private String name;

    @NotEmpty(message = "Description cannot be empty")
    @JsonProperty("description")
    private String description;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format") // Standard email validation
    @Pattern(
        regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$", // Custom pattern for Gmail
        message = "Email must belong to Gmail domain"
    )
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
