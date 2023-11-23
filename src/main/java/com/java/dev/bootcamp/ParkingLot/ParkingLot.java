package com.java.dev.bootcamp.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private int parkingCapacity=0;

    private Owner owner;

    public ParkingLot(int parkingCapacity,Owner owner)
    {
        this.parkingCapacity=parkingCapacity;
        this.owner=owner;
    }

    private Map<String,String> vehicleCache=new HashMap();

    public Map<String, String> getVehicleCache() {
        return vehicleCache;
    }

    public void setVehicleCache(Map<String, String> vehicleCache) {
        this.vehicleCache = vehicleCache;
    }

    public ParkingLot(int capacity)
    {
        this.parkingCapacity=capacity;

    }

    public void park(Vehicle vehicle) throws ParkingFullException {

        if(parkingCapacity==0)
        {
            owner.notifyParking();
        }
        if(parkingCapacity<=0 || vehicleCache.get(vehicle.getVehicleNumber())!=null)
        {
            throw new ParkingFullException("Parking Full");
        }
        parkingCapacity--;
        vehicleCache.put(vehicle.getVehicleNumber(), vehicle.getVehicleNumber());


    }

    public void unpark(Vehicle vehicle) throws ParkingFullException {

        if(vehicleCache.get(vehicle.getVehicleNumber())==null)
        {
            throw new ParkingFullException("Vehicle not present in the parking lot");
        }
        parkingCapacity++;
        vehicleCache.remove(vehicle.getVehicleNumber());


    }

    public boolean status (Vehicle vehicle) {
        if (vehicleCache.containsKey(vehicle.getVehicleNumber())) {
            return true;
        }
        else {
            return false;
        }
    }





}
