package org.example.Proxy;

import org.example.Model.Bike;

public class BikeProxy extends Bike{

    private static boolean isAdmin;
    private String username;
    private String password;
    private Bike bike;

    public BikeProxy(String username,String password, Bike bike) {
        isAdmin = username.equals("mohamed") && password.equals("12345678");
        if(isAdmin){
            this.bike=bike;
        }else{
            throw new IllegalArgumentException("you are not an admin !");
        }
    }

    @Override
    public int cost() {
        return bike.cost();
    }
}
