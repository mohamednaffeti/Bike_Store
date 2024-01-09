package org.example.AbstractFactory;

import org.example.Builder.IBikeBuilder;
import org.example.Model.Bike;

public interface IBikeFactory {
     Bike creerBicyclette(IBikeBuilder builder);
}
