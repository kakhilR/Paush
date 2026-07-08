package com.example.bms.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "shows")
@Getter
@Setter

public class Show extends BaseModel {
    private String name;
    @ManyToOne
    private Theater theater;
    @OneToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> feature;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Languages language;
}
