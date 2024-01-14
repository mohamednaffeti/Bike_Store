package org.example.AbstractFactory;

import org.example.Builder.IBikeBuilder;
import org.example.Builder.IClassicBikeBuilder;
import org.example.Model.Bike;

public class ClassicBikeFactory implements IBikeFactory {
    @Override
    public Bike createBike(IBikeBuilder builder) {
        if (builder instanceof IClassicBikeBuilder){
            return ((IClassicBikeBuilder) builder)
                    .setTypeFrame("steel frame")
                    .setModel("CityCruiser")
                    .setColor("Red")
                    .build();

        }else {
            throw new IllegalArgumentException("Builder invalide pour les bicyclettes normaux");
        }
    }
}
