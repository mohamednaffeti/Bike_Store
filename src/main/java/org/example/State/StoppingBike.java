package org.example.State;

public class StoppingBike implements BikeState{
    @Override
    public void state() {
        System.out.println("This Bike is Stopping now");
    }
}
