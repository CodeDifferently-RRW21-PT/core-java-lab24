package com.codedifferently.baronsfarm.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelXTest {

    @Test
    public void canConnectToInternetTest() {

        CanConnectToInternet connect = new ModelX(500);

        // Given
        String name = "Elon Net";

        // When
        Boolean expected = true;
        Boolean actual = connect.connectToNetwork(name);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void canReceiveCallTest() {

        CanReceiveCall connect = new ModelX(500);

        connect.receiveCall();

    }

    @Test
    public void driveTest() {

        Drivable connect = new ModelX(500);

        // Given
        Integer miles = 50;

        // When
        Integer expected = 550;
        connect.drive(miles);

    }

    @Test
    public void connectToAutoPilotTest() {

        ConnectToAutoPilot autoPilot = new ModelX(550);

        Boolean expected = true;
        Boolean actual = autoPilot.connectAutoPilot();

        Assertions.assertEquals(expected, actual);

    }

}
