/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist.Strategies;
import shoppinglist.TemplateMethods.EasyMeals;

/**
 * Concrete implementation of EasyMeals template method
 *
 */
public class BreadedChicken extends EasyMeals {
    
    @Override
    protected void collectIngredients(){
        System.out.println("Breaded chicken");
        System.out.println("Potato Waffled");
        System.out.println("Vegetables");
    }    
}
