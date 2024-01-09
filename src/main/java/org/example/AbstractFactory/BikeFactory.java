package org.example.AbstractFactory;

import org.example.Builder.ClassicBikeBuilder;
import org.example.Builder.ElectricBikeBuilder;
import org.example.Builder.IBikeBuilder;

public class BikeFactory {

    public static IBikeFactory getFactory(IBikeBuilder iBicycletteBuilder){
     if (iBicycletteBuilder instanceof ClassicBikeBuilder){
         return new ClassicBikeFactory();
     }else if (iBicycletteBuilder instanceof ElectricBikeBuilder){
         return new ElectricBikeFactory();
     }else{
         throw new IllegalArgumentException("ce builder ne concerne aucun factory");
     }
    }
}
