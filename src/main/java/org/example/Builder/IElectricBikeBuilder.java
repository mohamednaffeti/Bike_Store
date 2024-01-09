package org.example.Builder;

public interface IElectricBikeBuilder extends IBikeBuilder {
    IElectricBikeBuilder setMotorType(String motorType);
    IElectricBikeBuilder setBatteryCapacity(double batteryCapacity);
}
