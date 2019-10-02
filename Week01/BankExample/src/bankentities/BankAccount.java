/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author jwhite12
 */
public class BankAccount 
{
    //Variable Declaration
    private int balance;
    private int overdraft;
    private String holder;
    
    public BankAccount(String holder)
    {
        this.holder = holder;
        this.overdraft = 500;
        this.balance = 100;
    }
    
    public void depositMoney(int amount)
    {
        balance += amount;
    }
    
    public boolean withdrawMoney(int amount) {
        
        if ((balance + overdraft) < amount)
            return false;
            else {
            balance -= amount;
            return true;
        }
    }
    
    //Get Methods
    public int getBalance()
    {
        return balance;
    }    
    public String getHolder()
    {   
        return holder;
    }
    public int getOverdraft()
    {
        return overdraft;
    }    
    
    //Set Methods
    public void setOverdraft(int overdraft)
    {
        this.overdraft = overdraft;
    }      
}
