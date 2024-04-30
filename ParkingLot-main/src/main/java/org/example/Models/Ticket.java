package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.Status;

import java.time.LocalTime;
@Getter
@Setter
public class Ticket {
    Long id;
    LocalTime entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    Gate gate;
    Status status;
}
