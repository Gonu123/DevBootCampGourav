package com.java.dev.bootcamp.ParkingLot;

import com.java.dev.bootcamp.ParkingLot.Observer;

public interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);

    public void notifyObservers();
}
