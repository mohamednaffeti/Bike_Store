package org.example;

import org.example.AbstractFactory.BikeFactory;
import org.example.AbstractFactory.IBikeFactory;
import org.example.Builder.Director;
import org.example.Builder.IBikeBuilder;
import org.example.Decorator.BikeWithDoubleBattery;
import org.example.Decorator.BikeWithhelmet;
import org.example.Model.Bike;
import org.example.Model.ClassicBike;
import org.example.Model.ElectricBike;
import org.example.Proxy.BikeProxy;


public class Main {
    public static void main(String[] args) {

        //Builder and abstractFactory example
        IBikeBuilder iBikeBuilder = Director.electricBikeBuilder();
        IBikeFactory iBikeFactory = BikeFactory.getFactory(iBikeBuilder);
        Bike electricBike = iBikeFactory.createBike(iBikeBuilder);

        //Decorator example
        Bike classicBike = new ClassicBike();
        System.out.println("the initial cost is " + classicBike.cost());
        classicBike = new BikeWithhelmet(classicBike);
        System.out.println("The cost of a bike with helmet is" + classicBike.cost());
        Bike electronicBike = new ElectricBike();
        System.out.println("the initial cost is " + electronicBike.cost());
        electronicBike = new BikeWithDoubleBattery(electricBike);
        System.out.println("The cost of a bike with double battery is " + electronicBike.cost());

        //Proxy example
        BikeProxy bikeProxy=null ;
        try {
            bikeProxy = new BikeProxy("mohamed", "12345678", electronicBike);
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
        }
        System.out.println("proxy " + bikeProxy.cost());
    }
}