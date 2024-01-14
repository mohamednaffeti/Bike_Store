package org.example.Model;

public class ClassicBike extends Bike {

    private String typeFrame;

    public String getTypeFrame() {
        return typeFrame;
    }

    public void setTypeFrame(String typeFrame) {
        this.typeFrame = typeFrame;
    }


    @Override
    public String toString() {
        return "ClassicBike{" +super.toString()+
                "FrameType='" + typeFrame + '\'' +
                '}';
    }

    @Override
    public int cost() {
        return 200;
    }
}
