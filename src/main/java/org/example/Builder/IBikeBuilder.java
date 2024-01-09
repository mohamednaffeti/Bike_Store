package org.example.Builder;

import org.example.Model.Bike;

public interface IBikeBuilder {
            IBikeBuilder setModel(String model);
            IBikeBuilder setColor(String color);
            Bike build();

}
