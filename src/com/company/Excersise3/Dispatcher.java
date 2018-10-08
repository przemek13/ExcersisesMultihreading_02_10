package com.company.Excersise3;

public interface Dispatcher {

    void takeOrder(String sendersDetails, String recipientsDetails);

    void sendCourier(String sendersDetails, String recipientsDetails);

    void addCourier(ConcreteCourier courier);

}
