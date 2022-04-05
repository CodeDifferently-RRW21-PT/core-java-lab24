package com.codedifferently.baronsfarm.example;

import com.codedifferently.baronsfarm.example.CanConnectToInternet;
import com.codedifferently.baronsfarm.example.Drivable;

public class ModelX implements CanReceiveCall, CanConnectToInternet, Drivable, ConnectToAutoPilot {

    Integer previousMiles;

    public ModelX(Integer previousMiles) {
        this.previousMiles = previousMiles;
    }

    @Override
    public Boolean connectToNetwork(String connectionName) {
        return null;
    }

    @Override
    public void receiveCall() {
        System.out.println("Elon is now calling.");
    }

    @Override
    public void drive(Integer miles) {

        miles = previousMiles + miles;
        System.out.println("Today you finish driving with " + miles);
    }

    @Override
    public Boolean connectAutoPilot() {
        System.out.println("You are now in auto pilot mode.");
        return true;
    }
}
