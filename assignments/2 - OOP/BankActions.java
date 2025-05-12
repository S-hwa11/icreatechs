// ** BANK ACTIONS **
// DEPOSIT ✔️
// WITHDRAW ✔️
// REGISTER ✔️

package com.mycompany.icreatechs;

public class BankActions {
    AccountActions accActions = new AccountActions();
    
    public void Register(String accName, int initialDep, int accPin) {
        accActions.setUpAccount(accName, initialDep, accPin);
    }
    
    public void Deposit(int accPin, int depAmount) {
        accActions.Deposit(accPin, depAmount);
    }
    
    public void Withdraw(int accPin, int withAmount) {
        accActions.Withdraw(accPin, withAmount);
    }
    
    public String getAccountInfo(int accPin) {
        return accActions.getAccountInfo(accPin);
    }
    
    public boolean validateAccount(int accPin) {
        return accActions.isAccValid(accPin);
    }
}
