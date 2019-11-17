/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist.Strategies;
import shoppinglist.TemplateMethods.CookedMeals;

/**
 * Concrete implementation of CookedMeals template method
 * 
 */
public class SpagBol extends CookedMeals {
    
    @Override
    protected void collectIngredients() {
        System.out.println("Pasta Sauce");
    }
}
