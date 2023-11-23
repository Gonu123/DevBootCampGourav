package com.java.dev.bootcamp.service;

import java.util.List;

public class CabRide {
    private final int FARE_PER_KM = 10;
    private final int FARE_PER_MINUTE=2;

    private final int MIN_FARE = 40;

    private int totalTrips = 0;

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public int getFare(List<Integer> distanceTravelled, List<Integer> waitTimeInMinutes)
    {
        int totalFare=0;
        for(int i=0;i<distanceTravelled.size();i++)
        {
            int actualFare=distanceTravelled.get(i)*FARE_PER_KM+waitTimeInMinutes.get(i)*FARE_PER_MINUTE;
            totalFare=totalFare+Math.max(actualFare,MIN_FARE);
        }
        this.totalTrips = distanceTravelled.size();
        return totalFare;

    }
}
