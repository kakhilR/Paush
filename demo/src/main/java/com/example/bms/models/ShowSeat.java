package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seats seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;
}
