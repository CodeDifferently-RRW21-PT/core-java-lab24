package com.codedifferently.baronsfarm.example;

public class Bmw implements Drivable, CanConnectToInternet{

    Integer totalMiles;

    public Bmw(Integer totalMiles) {
        this.totalMiles = totalMiles;
    }

    @Override
    public Boolean connectToNetwork(String connectionName) {

        System.out.println("You're BMW is now connected to " + connectionName + " network");
        return true;
    }

    @Override
    public void drive(Integer miles) {

        miles = totalMiles + miles;

        System.out.println("You have drove " + miles + " today");
    }
}
