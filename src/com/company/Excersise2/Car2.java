package com.company.Excersise2;

public class Car2 extends Thread {
    Bridge bridge;

    Car2(Bridge bridge) {
        this.bridge = bridge;
    }

    public void run() {
        bridge.crossTheBridge(getName());
    }
}
