package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Theater extends BaseModel {
    private String name;
    private String address;
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private City city;
}
