package com.company.Excersise1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Time extends Thread {

    private final DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            LocalTime now = LocalTime.now();
            System.out.println("Time " + time.format(now));
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted.");
                return;
            }
        }
    }
}
