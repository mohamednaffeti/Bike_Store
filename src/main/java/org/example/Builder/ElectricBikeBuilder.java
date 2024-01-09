package org.example.Builder;

import org.example.Model.Bike;
import org.example.Model.ElectricBike;


public class ElectricBikeBuilder implements IElectricBikeBuilder {
    private String model;
    private String color;
    private String motorType;
    private double batteryCapacity;

    @Override
    public IBikeBuilder setModel(String model) {
        this.model=model;
        return this;
    }

    @Override
    public IBikeBuilder setColor(String color) {
        this.color=color;
        return this;
    }



    @Override
    public IElectricBikeBuilder setMotorType(String motorType) {
        this.motorType=motorType;
        return this;
    }

    @Override
    public IElectricBikeBuilder setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity=batteryCapacity;
        return this;
    }
    @Override
    public Bike build() {
        ElectricBike electricBike = new ElectricBike();
        electricBike.setModel(this.model);
        electricBike.setColor(this.color);
        electricBike.setMotorType(this.motorType);
        electricBike.setBatteryCapacity(this.batteryCapacity);
        return electricBike;
    }
}
