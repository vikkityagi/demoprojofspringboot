package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class MyEntityDto {

    

    public MyEntityDto(Long id,
            @NotNull(message = "Name cannot be null") @NotBlank(message = "Name cannot be blank") String name,
            @NotEmpty(message = "Description cannot be empty") String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private Long id;

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be blank")
    @JsonProperty("name")
    private String name;

    @NotEmpty(message = "Description cannot be empty")
    @JsonProperty("description")
    private String description;

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
}
