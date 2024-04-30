package org.example.Models;

import org.example.Models.Enums.ParkingStatus;

import java.util.List;

public class ParkingLot {
    Long id;
    List<ParkingFloor> parkingFloorList;
    List<Gate> gateList;
    ParkingStatus parkingLotStatus;
}
