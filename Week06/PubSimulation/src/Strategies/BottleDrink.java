
package Strategies;

import Templates.ColdDrinks;

/**
 *
 * @author jwhite12
 */
public class BottleDrink extends ColdDrinks {
    
    @Override
    protected void makeDrink(){
        System.out.println("Opening Bottle");
    }
    
}
