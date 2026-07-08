package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie extends BaseModel {
    private String name;
    private String description;
    @ManyToMany
    private List<Languages> language;
    private String genre;
    private int duration; // in minutes
    @ManyToMany
    private List<Actors> actors;
}
