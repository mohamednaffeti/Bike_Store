package org.example;

import org.example.AbstractFactory.BikeFactory;
import org.example.AbstractFactory.IBikeFactory;
import org.example.Adapter.BikeMaintenanceAdapter;
import org.example.Adapter.CalculateCostMaintenanceNew;
import org.example.Adapter.CalculateMaintenanceCostOld;
import org.example.Builder.Director;
import org.example.Builder.IBikeBuilder;
import org.example.Decorator.BikeWithDoubleBattery;
import org.example.Decorator.BikeWithhelmet;
import org.example.Model.Bike;
import org.example.Model.Buyer;
import org.example.Model.ClassicBike;
import org.example.Model.ElectricBike;
import org.example.Proxy.BikeProxy;
import org.example.State.BikeContext;
import org.example.State.RunningBike;
import org.example.Strategy.BankCheck;
import org.example.Strategy.BankTransfer;
import org.example.Strategy.BikePaiementContext;


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

        //Adapter pattern
        //adaptee , old method
        CalculateMaintenanceCostOld calculateMaintenanceCostOld = new CalculateMaintenanceCostOld();
        // class adapter use adaptee ( composition or inheritance ) to create the new method
        //CalculateCostMaintenanceNew bikeMaintenanceAdapter = new BikeMaintenanceAdapter(calculateMaintenanceCostOld);
        // test the new method
       // System.out.println(bikeMaintenanceAdapter.calculateCostMaintenanceNew());

        //with inheritance
        //CalculateCostMaintenanceNew bikeMaintenanceAdapter=new BikeMaintenanceAdapter();
        //bikeMaintenanceAdapter.calculateCostMaintenanceNew();

        //Observer pattern
        Buyer mohamed = new Buyer("mohamed");
        Buyer ahmed = new Buyer("ahmed");
        Buyer ali = new Buyer("ali");
        ClassicBike classicBike1=new ClassicBike();
        classicBike1.addBuyer(mohamed);
        classicBike1.addBuyer(ahmed);
        classicBike1.addBuyer(ahmed);
        classicBike1.setAvailibility(true);

        //State pattern
        BikeContext bikeContext = new BikeContext();
        bikeContext.state();
        bikeContext.setBikeState(new RunningBike());
        bikeContext.state();


        //Strategy pattern
        BikePaiementContext bikePaiementContext = new BikePaiementContext();
        bikePaiementContext.setPaymentMethod(new BankTransfer());
        bikePaiementContext.PaimentMethod();
        bikePaiementContext.setPaymentMethod(new BankCheck());
        bikePaiementContext.PaimentMethod();

    }
}