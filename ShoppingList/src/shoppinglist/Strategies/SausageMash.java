/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist.Strategies;
import shoppinglist.TemplateMethods.OvenMeals;


/**
 * Concrete implementation of OvenMeals template method
 * 
 */
public class SausageMash extends OvenMeals {
    
    @Override
    protected void collectIngredients() {
        System.out.println("Sausages");
        System.out.println("Mash");
    }
}
