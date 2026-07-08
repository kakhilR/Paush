package com.example.bms.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Payment extends BaseModel {
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode method;
    private String referenceNumber;
}
