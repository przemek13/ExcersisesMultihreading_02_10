package com.company.Excersise3;

import java.util.ArrayList;
import java.util.List;

public class CourierDispatcher extends Thread implements Dispatcher {

    private List<ConcreteCourier> couriers;

    public CourierDispatcher() {
        this.couriers = new ArrayList<>();
    }

    @Override
    public void takeOrder(String sendersDetails, String recipientDetails) {
        System.out.println("Order from: " + sendersDetails + " to: " + recipientDetails + " accepted.");
        sendCourier(sendersDetails, recipientDetails);
    }

    @Override
    public void sendCourier(String sendersDetails, String recipientsDetails) {
        for (ConcreteCourier courier : couriers) {
            if (courier.getCourierStatus() == CourierStatus.WAITING_FOR_FIRST_ORDER) {
                courier.realizeOrder(sendersDetails, recipientsDetails);
                return;
            }
        }
    }

    public void addCourier(ConcreteCourier courier) {
        couriers.add(courier);
    }
}



