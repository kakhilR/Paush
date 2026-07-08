package com.example.bms.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "languages")
@Getter
@Setter
public class Languages extends BaseModel {
    private String value;
}
