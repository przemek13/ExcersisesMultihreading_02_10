package com.company.Excersise3;

import java.util.ArrayList;
import java.util.List;

public class CourierDispatcher extends Thread implements Dispatcher {

    private List<Courier> couriers;

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
        for (Courier courier : couriers) {
            if (courier.courierStatus == CourierStatus.WAITING_FOR_FIRST_ORDER) {
                courier.realizeOrder(sendersDetails, recipientsDetails);
                return;
            }
        }
    }

    @Override
    public void updateCourierStatus(Courier courier) {
        System.out.println("Update courier status: " + courier);
    }

    @Override
    public void addCourier(Courier courier) {
        couriers.add(courier);
    }
}



