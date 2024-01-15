package org.example.State;

public class BikeContext {
    private BikeState bikeState;
    public BikeContext(){
        this.bikeState=new StoppingBike();
    }

    public void setBikeState(BikeState bikeState) {
        this.bikeState = bikeState;
    }
    public void state(){
        bikeState.state();
    }
}
