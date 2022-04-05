package com.codedifferently.baronsfarm.example;

public class AppleWatch implements CanReceiveCall, CanConnectToInternet{

    String contact;

    public AppleWatch(String contact) {
        this.contact = contact;
    }

    @Override
    public Boolean connectToNetwork(String connectionName) {

        System.out.println("Your apple watch is now connected to " + connectionName + " network.");
        return true;
    }

    @Override
    public void receiveCall() {
        System.out.println("You are now receiving a call from " + contact);
    }
}
