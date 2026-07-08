package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bookings extends BaseModel {
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> bookedSeats;
    private int totalAmount;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
    @OneToMany
    private List<Payment> payments;
    
}
