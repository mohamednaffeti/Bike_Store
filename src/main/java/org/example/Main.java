package org.example;

import org.example.AbstractFactory.BikeFactory;
import org.example.AbstractFactory.IBikeFactory;
import org.example.Builder.Director;
import org.example.Builder.IBikeBuilder;
import org.example.Model.Bike;


public class Main {
    public static void main(String[] args) {

        IBikeBuilder iBicycletteBuilder = Director.electricBikeBuilder();
        IBikeFactory iFactorybicyclette= BikeFactory.getFactory(iBicycletteBuilder);
        Bike bicyclette = iFactorybicyclette.creerBicyclette(iBicycletteBuilder);
        System.out.println(bicyclette);
        IBikeBuilder iBicycletteNormalBuilder = Director.classicBikeBuilder();
        iFactorybicyclette = BikeFactory.getFactory(iBicycletteNormalBuilder);
        bicyclette = iFactorybicyclette.creerBicyclette(iBicycletteNormalBuilder);
        System.out.println(bicyclette);


    }
}