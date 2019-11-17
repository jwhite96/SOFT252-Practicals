/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist.TemplateMethods;

/**
 * An abstract template method for easy meals
 * 
 */
public abstract class EasyMeals {
    
    public final void shopList(){
        collectIngredients();
    }
    
    /**
     * An abstract method for ingredients: this is where the child algorithms
     * differ from each other.
     */    
    protected abstract void collectIngredients();
        
}
