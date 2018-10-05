package com.company.Excersise3;

public class ConcreteCourier extends Courier {

    public ConcreteCourier(Dispatcher dispatcher, String couriersName) {
        super(dispatcher, couriersName);
        courierStatus = CourierStatus.WAITING_FOR_FIRST_ORDER;
    }

    @Override
    public void realizeOrder(String sendersDetails, String recipientsDetails) {
        courierStatus = CourierStatus.DURING_ORDER;
        System.out.println(couriersName + " picks-up parcel at " + sendersDetails);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(couriersName + " leaves parcel at " + recipientsDetails);
        System.out.println();
        courierStatus = CourierStatus.WAITING_FOR_ANOTHER_ORDER;
    }

}
