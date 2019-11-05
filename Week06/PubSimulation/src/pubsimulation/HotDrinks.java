package pubsimulation;

//TEMPLATE METHOD
public abstract class HotDrinks {
    
    public final void prepareDrinks() {
        boilWater();        
        pourDrink();
        addIngredients();
}
    
    //Functions that are used by multiple different drinks (NOT ABSTRACT)
    protected void boilWater(){
        System.out.println("Boiling Water");
    }
    
    protected void pourDrink(){
        System.out.println("Pouring Drink");
    }    
    
    //Functions for adding ingredients
    protected abstract void addIngredients();
    protected abstract void mixIngredients();
}
  
