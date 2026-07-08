package com.example.bms.models;

import jakarta.persistence.Entity;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SeatType extends BaseModel {
    private String value;
}
