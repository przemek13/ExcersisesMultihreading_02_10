package com.company.Excersise3;

public abstract class Courier {

    protected CourierStatus courierStatus;
    protected Dispatcher dispatcher;
    protected String couriersName;

    public Courier(Dispatcher dispatcher, String couriersName) {
        this.dispatcher = dispatcher;
        this.couriersName = couriersName;
    }

    public String getCouriersName() {
        return couriersName;
    }

    public abstract void realizeOrder(String sendersDetails, String recipientsDetails);
}
