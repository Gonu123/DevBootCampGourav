package com.java.dev.bootcamp.service;

import com.java.dev.bootcamp.entities.Invoice;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private Invoice invoice;

    public Invoice generateInvoiceForMonth()
    {
        CabRide cabride = new CabRide();
        List<Integer> distanceTravelled = new ArrayList<>();
        List<Integer> waitTimeInMinutes = new ArrayList<>();
        distanceTravelled.add(10);
        distanceTravelled.add(20);
        waitTimeInMinutes.add(5);
        waitTimeInMinutes.add(10);
        int totalFare = cabride.getFare(distanceTravelled,waitTimeInMinutes);
        Invoice invoice = new Invoice(cabride.getTotalTrips(),totalFare,totalFare/ cabride.getTotalTrips());
        return  invoice;

    }
}
