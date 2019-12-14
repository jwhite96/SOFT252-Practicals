
package Strategies;

import Templates.Spirits;

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
