package com.company.Excersise2;

public class Car1 extends Thread {
    Bridge bridge;

    Car1(Bridge bridge) {
        this.bridge = bridge;
    }

    public void run() {
        bridge.crossTheBridge(getName());
    }
}
