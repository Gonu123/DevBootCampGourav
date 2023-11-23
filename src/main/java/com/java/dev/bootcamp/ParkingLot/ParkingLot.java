package com.java.dev.bootcamp.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot implements Subject {

    private int parkingCapacity=0;

    private OwnerObserver owner;

    private List<Observer> observerList=new ArrayList();

    public ParkingLot(int parkingCapacity,OwnerObserver owner)
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
            notifyObservers();
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


    @Override
    public void register(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
for(Observer obj:observerList)
{
    obj.update();
}
    }
}
