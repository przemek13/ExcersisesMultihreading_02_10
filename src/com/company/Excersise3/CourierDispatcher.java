package com.company.Excersise3;

import java.util.ArrayList;
import java.util.List;

public class CourierDispatcher extends Thread implements Dispatcher {

    private List<ConcreteCourier> couriers;
    private List<ConcreteCourier> workingCouriers;

    public CourierDispatcher() {
        this.couriers = new ArrayList<>();
        this.workingCouriers = new ArrayList<>();
    }

    @Override
    public synchronized void takeOrder(String sendersDetails, String recipientDetails) {
        System.out.println("Order from: " + sendersDetails + " to: " + recipientDetails + " accepted.");
        if (workingCouriers.size() == couriers.size()) {
            try {
                System.out.println("Waiting: Order from: " + sendersDetails + " to: " + recipientDetails + " accepted.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sendCourier(sendersDetails, recipientDetails);
    }

    @Override
    public void sendCourier(String sendersDetails, String recipientsDetails) {
        for (ConcreteCourier courier : couriers) {
            if (courier.getCourierStatus() == CourierStatus.WAITING_FOR_ORDER) {
                courier.realizeOrder(sendersDetails, recipientsDetails);
                workingCouriers.add(courier);
                return;
            }
        }
    }

    public void addCourier(ConcreteCourier courier) {
        couriers.add(courier);
    }
}



