package com.java.dev.bootcamp.ParkingLot;

public class OwnerObserver implements Observer {

    private boolean isParkingFull;
    @Override
    public void update() {
        System.out.println("Owner Notified");
    }

    @Override
    public void setSubject(Subject sub) {

    }
}
