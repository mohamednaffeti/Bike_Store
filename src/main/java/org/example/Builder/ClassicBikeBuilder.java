package org.example.Builder;
import org.example.Model.Bike;
import org.example.Model.ClassicBike;


public class ClassicBikeBuilder implements IClassicBikeBuilder {

    private String model;
    private String color;
    private String typeFrame;
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
    public IBikeBuilder setTypeFrame(String typeFrame) {
        this.typeFrame=typeFrame;
        return this;
    }
    @Override
    public Bike build() {
       ClassicBike classicBike = new ClassicBike();
       classicBike.setModel(this.model);
       classicBike.setColor(this.color);
       classicBike.setTypeFrame(this.typeFrame);
       return classicBike;
    }
}
