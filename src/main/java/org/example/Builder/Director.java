package org.example.Builder;

public class Director {
    public static IBikeBuilder classicBikeBuilder(){
        return new ClassicBikeBuilder();
    }
    public static IBikeBuilder electricBikeBuilder(){
        return new ElectricBikeBuilder();
    }
}
