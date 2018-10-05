package com.company.Excersise4;

public abstract class ShakeRecipe {

    public final void shakeRecipeScheme() {

        System.out.print("SHAKE TYPE: ");
        setShakeType();
        System.out.print("Liquid: ");
        setUpLiquid();
        System.out.print("Fruits: ");
        setUpFruits();
        System.out.print("Sweetener: ");
        setUpSweetener();
        System.out.print("Vegetables: ");
        setUpVegetables();
        System.out.print("Superfoods: ");
        setUpSuperfoods();
    }

    public abstract void setShakeType();

    public abstract void setUpLiquid();

    public abstract void setUpFruits();

    public abstract void setUpSweetener();

    public abstract void setUpVegetables();

    public abstract void setUpSuperfoods();
}
