/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;
import shoppinglist.Strategies.ICollectIngredients;

/**
 *
 * 
 */
public class List {
    private ICollectIngredients strategy;
    private String greetings = "Please choose a meal";
    private String offerings = "Spag Bol, Tortellini, Sausage & Mash, Breaded Chicken, Chilli, Chicken Breast";
    private String nullStrategyInfo = "Invalid Selection ";         
    
     public List() {
        this.strategy = null;
    }
    
     public void setStrategy(ICollectIngredients strategy){
        this.strategy = strategy;
    } 
     
     
     
     
     

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String s) {
        this.greetings = s;
    }

    public String getOfferings() {
        return offerings;
    }

    public void setOfferings(String s) {
        this.offerings = s;
    }

    public String getNullStrategyInfo() {
        return nullStrategyInfo;
    }

    public void setNullStrategyInfo(String s) {
        this.nullStrategyInfo = s;
    }
     
     
     
}
