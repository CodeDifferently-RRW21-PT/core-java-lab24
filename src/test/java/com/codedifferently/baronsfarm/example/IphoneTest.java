package com.codedifferently.baronsfarm.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IphoneTest {

    @Test
    public void connectToInternetTest() {

        CanConnectToInternet connect = new Iphone("Sam");

        //Given
        String name = "XfinityOne";

        // When
        Boolean expected = true;
        Boolean actual = connect.connectToNetwork(name);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
