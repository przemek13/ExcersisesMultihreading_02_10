package com.company.Excersise4;

public class BananaShakeRecipe extends ShakeRecipe {

    @Override
    public void setShakeType() {
        System.out.println("BANANA");
    }

    @Override
    public void setUpLiquid() {
        System.out.println("200ml coconut milk, 100 ml water");
    }

    @Override
    public void setUpFruits() {
        System.out.println("300g banana");
    }

    @Override
    public void setUpSweetener() {
        System.out.println("10g dark chocolate");
    }

    @Override
    public void setUpVegetables() {
        System.out.println("no vegetables");
    }

    @Override
    public void setUpSuperfoods() {
        System.out.println("30g peanuts");
    }
}
