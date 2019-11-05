/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwhite12
 */
public class Cocktail extends Spirits {
    
    @Override
    protected void addSpirit(){
    System.out.println("Adding Spirit");
    }
    
    @Override
    protected void addGarnish(){
        System.out.println("Adding Garnish");
    }
    
}
