/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;

import Templates.HotDrinks;

/**
 *
 * @author jwhite12
 */
public class Coffee extends HotDrinks {
    
    @Override
    protected void mixIngredients(){
        System.out.println("Brew Coffee");
    }
    
    @Override
    protected void addIngredients() {
        System.out.println("Adding Milk");
    }
}
