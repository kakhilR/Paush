package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class City extends BaseModel{
    private String name;
    @OneToMany(
        mappedBy = "city"
    )
    private List<Theater> theaters;
}
