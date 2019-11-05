package pubsimulation;


//TEMPLATE METHOD
public abstract class ColdDrinks {
 
    public final void prepareDrink(){
        pourDrink();
        makeDrink();
    }
    
    //Functions that are used by multiple different drinks (NOT ABSTRACT)
    protected void pourDrink()
    {
        //Code for this function
        System.out.println("Pouring Drink");
    }
    
    //Functions for Bottled Drinks
    protected abstract void makeDrink();
}
