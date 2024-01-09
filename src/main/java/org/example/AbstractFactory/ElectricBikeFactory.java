package org.example.AbstractFactory;

import org.example.Builder.IBikeBuilder;
import org.example.Builder.IElectricBikeBuilder;
import org.example.Model.Bike;

public class ElectricBikeFactory implements IBikeFactory {
    @Override
    public Bike creerBicyclette(IBikeBuilder builder) {
        if (builder instanceof IElectricBikeBuilder){
           return  ((IElectricBikeBuilder) builder)
                   .setMotorType("hub motor")
                   .setBatteryCapacity(500.0)
                   .setModel("Trek Powerfly")
                   .setColor("Yellow")

                   .build();
        }else{
            throw new IllegalArgumentException("Builder invalide pour les bicyclettes professionnelles");
        }
    }
}
