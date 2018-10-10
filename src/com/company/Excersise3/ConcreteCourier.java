package com.company.Excersise3;

public class ConcreteCourier extends Thread implements Courier {

    private Dispatcher dispatcher;
    private String couriersName;
    private String sendersDetails;
    private String recipientsDetails;
    private CourierStatus courierStatus;

    public CourierStatus getCourierStatus() {
        return courierStatus;
    }

    public ConcreteCourier(Dispatcher dispatcher, String couriersName) {
        this.dispatcher = dispatcher;
        this.couriersName = couriersName;
        courierStatus = CourierStatus.WAITING_FOR_ORDER;
    }

    @Override
    public synchronized void realizeOrder(String sendersDetails, String recipientsDetails) {
        this.sendersDetails = sendersDetails;
        this.recipientsDetails= recipientsDetails;
        this.courierStatus = CourierStatus.DURING_ORDER;
        start();
        notify();
    }

    @Override
    public synchronized void run() {
        System.out.println(couriersName + " picks-up parcel at " + sendersDetails);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(couriersName + " leaves parcel at " + recipientsDetails);
        System.out.println();
        this.courierStatus = CourierStatus.WAITING_FOR_ORDER;
    }
}
