package org.example.Model;

import org.example.Observer.Observer;

public class Buyer implements Observer {
    String name;

    public Buyer(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        System.out.println(this.name + " has new notification " + message);
    }
}
