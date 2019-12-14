
package pubsimulation;

import Strategies.IDrinks;

/**
 *
 * @author jwhite12
 */
public class Landlord {
    
    private IDrinks strategy;    
    private String greeting = "What can I get for ya boss?";
    private String offers = "We have: Pint, Bottle, Cocktail, Tea & Coffee";
    private String invalid = "We don't do that here, Please choose again";

    public static IDrinks selectStrategy(String drinkType){
        IDrinks strategy;
        switch (drinkType) {
            case "Pint":
                strategy = new Strategies.TapDrinks();
                break;
            case "Bottle":
                strategy = new Strategies.BottleDrink();
                break;
            case "Tea":
                strategy = new Strategies.Tea();
                break;
            case "Coffee":
                strategy = new Strategies.Coffee();
                break;
            case "Cocktail":
                strategy = new Strategies.Cocktail();
                break;
        }
        return strategy;
    }    
    
    //Getters
    public IDrinks getStrategy() {
        return strategy;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getOffers() {
        return offers;
    }

    public String getInvalid() {
        return invalid;
    }

    //Setters
    public void setStrategy(IDrinks strategy) {
        this.strategy = strategy;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }
}
