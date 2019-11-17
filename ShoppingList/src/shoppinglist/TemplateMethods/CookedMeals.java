/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist.TemplateMethods;

/**
 * An abstract template method for cooked meals e.g.Spaghetti Bol & Chilli
 * 
 */
public abstract class CookedMeals {
    
    public final void shopList(){
        commonIngredients();
        collectIngredients();
    }
    
    /**
     * A concrete implementation for common method: common ingredients.
     */
    protected void commonIngredients(){
        System.out.println("Mince Meat");
        System.out.println("Onions");
        System.out.println("Mushrooms");
    }
    
    /**
     * An abstract method for ingredients: this is where the child algorithms
     * differ from each other.
     */    
    protected abstract void collectIngredients();
           
}