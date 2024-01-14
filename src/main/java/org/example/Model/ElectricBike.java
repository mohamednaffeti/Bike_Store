package org.example.Model;

public class ElectricBike extends Bike {
    private String motorType;
    private double batteryCapacity;
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
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

}
