package com.company.Excersise3;

public class CouriersOperations {
    public static void main(String[] args) throws InterruptedException {
        Dispatcher dispatcher = new CourierDispatcher();

        Courier courier1 = new ConcreteCourier(dispatcher, "Courier1");
        Courier courier2 = new ConcreteCourier(dispatcher, "Courier2");
        Courier courier3 = new ConcreteCourier (dispatcher, "Courier3");

        dispatcher.addCourier(courier1);
        dispatcher.addCourier(courier2);
        dispatcher.addCourier(courier3);

        dispatcher.takeOrder("Sender A", "Receipient B");
        dispatcher.takeOrder("Sender C", "Receipient D");
        dispatcher.takeOrder("Sender E", "Receipient F");
        dispatcher.takeOrder("Sender G", "Receipient H");

    }
}
