package org.example.Model;

import org.example.Observer.Observable;
import org.example.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ClassicBike extends Bike implements Observable {

    private String typeFrame;
    private String availibility;
    private List<Observer> observerList;
    public String getTypeFrame() {
        return typeFrame;
    }

    public void setTypeFrame(String typeFrame) {
        this.typeFrame = typeFrame;
    }

    public ClassicBike() {
        this.observerList = new ArrayList<>();
    }



    @Override
    public String toString() {
        return "ClassicBike{" +super.toString()+
                "FrameType='" + typeFrame + '\'' +
                '}';
    }

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public void addBuyer(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeBuyer(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllBuyers() {
        observerList.forEach(observer -> observer.update(availibility));
    }

    public void setAvailibility(boolean available) {
        this.availibility = this.getClass().getSimpleName()+" "+(available ? " Available" : " not Available");
        notifyAllBuyers();
    }
}
