package org.example.Models;

import org.example.Models.Enums.ParkingStatus;

import java.util.*;

public class ParkingFloor {
    Long id;
    Long parkingFloorNum;
    List<ParkingSpot> parkingSpotList;
    ParkingStatus parkingFloorStatus;
}
