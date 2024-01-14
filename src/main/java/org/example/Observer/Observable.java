package org.example.Observer;

public interface Observable {
    void addBuyer(Observer observer);
    void removeBuyer(Observer observer);
    void notifyAllBuyers();

}
