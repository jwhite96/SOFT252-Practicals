/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author jwhite12
 */
public class Tea extends HotDrinks{
    
    @Override
    protected void mixIngredients() {
        System.out.println("Adding Tea Bag");
    }    

    @Override
    protected void addIngredients() {
        System.out.println("Adding Lemon");
    }    
}
