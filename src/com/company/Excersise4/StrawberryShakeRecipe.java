package com.company.Excersise4;

public class StrawberryShakeRecipe extends ShakeRecipe {


    @Override
    public void setShakeType() {
        System.out.println("STRAWBERRY");
    }

    @Override
    public void setUpLiquid() {
        System.out.println("300ml milk");
    }

    @Override
    public void setUpFruits() {
        System.out.println("200g strawberries");
    }

    @Override
    public void setUpSweetener() {
        System.out.println("15g brown sugar");
    }

    @Override
    public void setUpVegetables() {
        System.out.println("no vegetables");
    }

    @Override
    public void setUpSuperfoods() {
        System.out.println("5g chia");
    }
}
