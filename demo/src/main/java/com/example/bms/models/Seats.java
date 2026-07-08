package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seats extends BaseModel {
    private int rowNumber;
    private int colNumber;
    private int seatNumber;
    @ManyToOne
    private SeatType seatType;
}
