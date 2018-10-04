package com.company.Excersise1;

public class TimeAndTempDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Time();
        Thread thread2 = new Temperature();
        thread1.start();
        thread2.start();
        thread2.sleep(130000);
        thread2.interrupt();
        thread1.sleep(65000);
        thread1.interrupt();
        Thread.sleep(1);
        System.out.println("Finish.Thank you for using our application.");
    }
}
