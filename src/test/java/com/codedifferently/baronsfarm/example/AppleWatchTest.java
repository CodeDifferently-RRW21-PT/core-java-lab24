package com.codedifferently.baronsfarm.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleWatchTest {

    @Test
    public void canConnectToInternetTest() {

        CanConnectToInternet connect = new AppleWatch("Tariq");

        //Given
        String name = "Tmobile One";

        // When
        Boolean expected = true;
        Boolean actual = connect.connectToNetwork(name);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
