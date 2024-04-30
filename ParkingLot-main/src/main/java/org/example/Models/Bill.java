package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.Status;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class Bill {
    Long id;
    Ticket ticket;
    LocalTime exitTime;
    int amount;
    List<Payment> payments;
    Status status;
}
