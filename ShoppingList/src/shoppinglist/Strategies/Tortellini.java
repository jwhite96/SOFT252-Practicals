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
public class Tortellini extends EasyMeals{
    
    @Override
    protected void collectIngredients() {
        System.out.println("Tortellini");
        System.out.println("Sauce");    
    }
}
