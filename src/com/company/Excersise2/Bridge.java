package com.company.Excersise2;

public class Bridge {
    synchronized void crossTheBridge(String carName) {
        System.out.println(carName + " approaches the bridge.");
        try {
            Thread.sleep(9000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(carName + " left the bridge.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
