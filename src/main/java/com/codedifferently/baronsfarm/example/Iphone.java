package com.codedifferently.baronsfarm.example;

public class Iphone implements CanReceiveCall, CanConnectToInternet{

    String contact;

    public Iphone(String contact) {
        this.contact = contact;
    }

    @Override
    public Boolean connectToNetwork(String connectionName) {

        System.out.println("You're Iphone is now connected to " + connectionName + " network");
        return true;
    }

    @Override
    public void receiveCall() {
        System.out.println("You are now receiving a call from " + contact);
    }
}
