package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.PaymentMode;
import org.example.Models.Enums.Status;

import java.time.LocalTime;
@Getter
@Setter
public class Payment {
    Long id;
    PaymentMode paymentMode;
    int amount;
    LocalTime time;
    Status status;
}
