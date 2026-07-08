package com.example.bms.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String createdAt;
    private String updatedAt;
}

/*
    Base class can be extended by other entities in the system 

    No Table for BaseModel is required as it is not a concrete entity, 
    but rather a superclass that provides common attributes and behavior for other entities. 
    The @MappedSuperclass annotation is used to indicate that this class is not an entity itself, 
    but its properties should be inherited by subclasses that are entities. 
    This allows for code reuse and consistency across different entity classes in the system.
 */