package com.company.Excersise4;

public class MangoShakeRecipe extends ShakeRecipe {

    @Override
    public void setShakeType() {
        System.out.println("MANGO");
    }

    @Override
    public void setUpLiquid() {
        System.out.println("300ml almond milk");
    }

    @Override
    public void setUpFruits() {
        System.out.println("150g mango, 100g nectarine");
    }

    @Override
    public void setUpSweetener() {
        System.out.println("10g agave syrup");
    }

    @Override
    public void setUpVegetables() {
        System.out.println("no vegetables");
    }

    @Override
    public void setUpSuperfoods() {
        System.out.println("0,1g vanilla seeds");
    }
}
