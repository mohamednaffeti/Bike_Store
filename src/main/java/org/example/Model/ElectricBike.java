package org.example.Model;

import org.example.Observer.Observable;
import org.example.Observer.Observer;

import java.util.List;

public class ElectricBike extends Bike implements Observable {
    private String motorType;
    private double batteryCapacity;
    private String availibility;
    private List<Observer> observerList;
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricBike() {
    }

    public ElectricBike(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public String toString() {
        return "ElectricBike{" + super.toString()+
                "MotorType='" + motorType + '\'' +
                ", BatteryCapacity=" + batteryCapacity +
                '}';
    }

    @Override
    public int cost() {
        return 500;
    }

    @Override
    public void addBuyer(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeBuyer(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllBuyers() {
        observerList.forEach(observer -> observer.update(availibility));
    }

    public void setAvailibility(boolean available) {
        this.availibility = this.getClass().getSimpleName()+ " "+ (available ? "Available" : "Not Available");
        notifyAllBuyers();
    }
}
