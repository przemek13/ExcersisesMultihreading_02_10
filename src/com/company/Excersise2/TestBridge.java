package com.company.Excersise2;

public class TestBridge {
    public static void main(String args[]) {
        Bridge bridgeControl = new Bridge();
        Car1 car1 = new Car1(bridgeControl);
        car1.setName("Car no.1");
        car1.start();
        Car2 car2 = new Car2(bridgeControl);
        car2.setName("Car no.2");
        car2.start();
    }
}
