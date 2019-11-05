package pubsimulation;

//TEMPLATE METHOD
public abstract class Spirits {
    
    public final void prepareDrinks() {
        addIce();
        addSpirit();
        addMixer();
        addGarnish();
}
    
    //Functions that are used by multiple different drinks (NOT ABSTRACT)
    protected void addIce() {
        System.out.println("Adding Ice");
    }    
    protected void addMixer() {
        System.out.println("Adding Mixer");
    }
    
    //Functions for Long Drink
    protected abstract void addSpirit();
    protected abstract void addGarnish();    
}
