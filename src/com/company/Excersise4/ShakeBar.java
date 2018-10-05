package com.company.Excersise4;

public class ShakeBar {
    public static void main(String[] args) {
        ShakeRecipe[] shakeRecipes = {new StrawberryShakeRecipe(), new BananaShakeRecipe(), new MangoShakeRecipe()};
        for (ShakeRecipe shakeRecipe : shakeRecipes) {
            System.out.println();
            shakeRecipe.shakeRecipeScheme();
        }
    }
}