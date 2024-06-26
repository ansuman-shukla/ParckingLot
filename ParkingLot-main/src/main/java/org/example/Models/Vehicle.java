package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.VehicleType;

@Getter
@Setter
public class Vehicle {
    Long id;
    Long vehNum;
    VehicleType vehicleType;
    User owner;
}
