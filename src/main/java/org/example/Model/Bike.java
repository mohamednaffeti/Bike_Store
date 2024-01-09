package org.example.Model;

public abstract class Bike {
    private String model;
    private String color;
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Bike{" +
                "Model='" + model + '\'' +
                ", Color='" + color + '\'' +

                '}';
    }


}
