package org.example.Models;

import org.example.Models.Enums.ParkingStatus;
import org.example.Models.Enums.VehicleType;

import java.util.List;

public class ParkingSpot {
    Long id;
    Long parkingSpotNum;
    ParkingStatus parkingStatus;
    List<VehicleType> vehicleTypeList;
    ParkingFloor parkingFloor;

}
