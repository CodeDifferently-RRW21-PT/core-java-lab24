package com.codedifferently.baronsfarm.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BmwTest {

    @Test
    public void canConnectToInternetTest() {

        CanConnectToInternet connect = new Bmw(1200);

        // Given
        String name = "BMW Connect";

        // When
        Boolean expected = true;
        Boolean actual = connect.connectToNetwork(name);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void driveTest() {

        Drivable connect = new Bmw(1200);

        // Given
        Integer miles = 50;

        // When
        Integer expected = 1250;
        connect.drive(miles);

        // Then

    }
}
