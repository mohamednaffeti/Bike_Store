package org.example.State;

public class RunningBike implements BikeState{
    @Override
    public void state() {
        System.out.println("This Bike is running now");
    }
}
