package com.company.Excersise3;

import java.util.ArrayList;
import java.util.List;

public class CourierDispatcher extends Thread implements Dispatcher {

    private List<ConcreteCourier> couriers;
    protected static List<ConcreteCourier> workingCouriers;

    public CourierDispatcher() {
        this.couriers = new ArrayList<>();
        this.workingCouriers = new ArrayList<>();
    }

    public static List<ConcreteCourier> getWorkingCouriers() {
        return workingCouriers;
    }


    public static void setWorkingCouriers(List<ConcreteCourier> workingCouriers) {
        CourierDispatcher.workingCouriers = workingCouriers;
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
                workingCouriers.add(courier);
                courier.realizeOrder(sendersDetails, recipientsDetails);
                System.out.println(workingCouriers);
                return;
            }
        }
    }

    public void addCourier(ConcreteCourier courier) {
        couriers.add(courier);
    }
}



