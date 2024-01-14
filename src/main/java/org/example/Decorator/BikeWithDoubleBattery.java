package org.example.Decorator;

import org.example.Model.Bike;

public class BikeWithDoubleBattery extends Bike {
    private Bike bike;
    public BikeWithDoubleBattery(Bike bike){
        this.bike=bike;
    }
    @Override
    public int cost() {
        return bike.cost()+200;
    }
}
