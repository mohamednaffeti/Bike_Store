package org.example.Decorator;

import org.example.Model.Bike;

public class BikeWithhelmet extends Bike {


    private Bike bike;

    public BikeWithhelmet(Bike bike) {
        this.bike = bike;
    }

    @Override
    public int cost() {
        return bike.cost()+100;
    }


}
