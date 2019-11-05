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
public class TapDrinks extends ColdDrinks{
    
    @Override
    protected void makeDrink(){
        System.out.println("Placing glass under tap");
    }    
}
