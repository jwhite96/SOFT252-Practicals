/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist.TemplateMethods;

/**
 * An abstract template method for oven meals
 * 
 */
public abstract class OvenMeals {
    
    public final void shopList(){
        collectIngredients();
    }
    
    /**
     * A concrete implementation for common method: collect vegetables.
     */
    protected void collectVeg(){
        System.out.println("Vegetables");
    }
    
    /**
     * An abstract method for ingredients: this is where the child algorithms
     * differ from each other.
     */    
    protected abstract void collectIngredients();
        
}
