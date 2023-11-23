package com.java.dev.bootcamp.entities;

public class Invoice {
    private int totalNumberofRides = 0;
    private int totalFare = 0;
    private int avgFare = 0;

    public int getTotalNumberofRides() {
        return totalNumberofRides;
    }

    public void setTotalNumberofRides(int totalNumberofRides) {
        this.totalNumberofRides = totalNumberofRides;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    public int getAvgFare() {
        return avgFare;
    }

    public void setAvgFare(int avgFare) {
        this.avgFare = avgFare;
    }

    public Invoice(int totalNumberOfRides, int totalFare, int avgFare)
    {
        this.totalNumberofRides=totalNumberOfRides;
        this.totalFare=totalFare;
        this.avgFare=avgFare;
    }

    {

    }

}
