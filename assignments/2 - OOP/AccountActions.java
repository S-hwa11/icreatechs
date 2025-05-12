// ** ACCOUNT ACTIONS **
// CHECK SAVINGS ✔
// GET INFO ✔️
// SETTER ✔️
// GETTER ❌

package com.mycompany.icreatechs;

public class AccountActions {
    private String accountName;
    private int accountBalance;
    private int accountPin;
    
    public void setUpAccount(String accName, int accBal, int accPin) {
        this.accountName = accName;
        this.accountBalance = accBal;
        this.accountPin = accPin;
    }
    
    public void Deposit(int accPin, int depAmount) {
        this.accountBalance = this.accountBalance + depAmount;
    }
    
    public void Withdraw(int accPin, int withAmount) {
        if (this.accountBalance < withAmount) {
            System.out.println("Balance is not enough!");
            
            System.exit(0);
        }
        
        this.accountBalance = this.accountBalance - withAmount;
    }
    
    public String getAccountInfo(int accPin) {
        return "Account Name: " + this.accountName + " | Account Balance: " + this.accountBalance;
    }
    
    public boolean isAccValid(int accPin) {
        return accPin == this.accountPin;
    }
}
