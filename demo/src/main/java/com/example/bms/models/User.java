package com.example.bms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity(name = "users")
@Getter
@Setter
public class User extends BaseModel {
    private String name;
    private String email;
    private String phoneNumber;
    @OneToMany(
        mappedBy = "user"
    )
    private List<Bookings> bookings;
}
