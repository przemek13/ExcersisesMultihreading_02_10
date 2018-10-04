package com.company.Excersise1;

import java.util.LinkedList;
import java.util.Random;

public class Temperature extends Thread {

    LinkedList m = new LinkedList();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Random generator = new Random();
            m.add(generator.nextInt(40));
            System.out.println("Tempereture: " + m.get(i) + " degrees Celssius.");
            try {
                Thread.sleep(45000);
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted.");
                return;
            }
        }
    }
}

