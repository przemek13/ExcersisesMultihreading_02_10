package com.company.Excersise3;

public class ConcreteCourier implements Courier, Runnable {

    private final Dispatcher dispatcher;
    private String couriersName;
    private String sendersDetails;
    private String recipientsDetails;
    private CourierStatus courierStatus;
    CourierDispatcher courierDispatcher;

    public CourierStatus getCourierStatus() {
        return courierStatus;
    }

    public ConcreteCourier(Dispatcher dispatcher, String couriersName) {
        this.dispatcher = dispatcher;
        this.couriersName = couriersName;
        courierStatus = CourierStatus.WAITING_FOR_ORDER;
    }

    @Override
    public void realizeOrder(String sendersDetails, String recipientsDetails) {
        this.sendersDetails = sendersDetails;
        this.recipientsDetails= recipientsDetails;
        courierStatus = CourierStatus.DURING_ORDER;
        new Thread(this).start();
    }

    @Override
    public void run() {
        courierStatus = CourierStatus.DURING_ORDER;
        System.out.println(couriersName + " picks-up parcel at " + sendersDetails);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(couriersName + " leaves parcel at " + recipientsDetails);
        System.out.println();
        courierStatus = CourierStatus.WAITING_FOR_ORDER;
        CourierDispatcher.workingCouriers.remove(this);
        System.out.println(CourierDispatcher.workingCouriers);
        synchronized (dispatcher) {
            dispatcher.notify();
        }
    }

    @Override
    public String toString() {
        return "ConcreteCourier{" +
                "couriersName='" + couriersName + '\'' +
                "courierStatus=" + courierStatus +
                '}';
    }
}
