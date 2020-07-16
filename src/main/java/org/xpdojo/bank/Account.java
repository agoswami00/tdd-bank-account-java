package org.xpdojo.bank;

public class Account {
    Double balance = 0.0;

    public Double getBalance(){
        return 0.0;
    }

    public Double deposit(Double amount){
        if(amount > 0)
            return balance += amount;
        else
            return balance;
    }

    public Double withdraw(Double amount){
        return balance -= amount;
    }

}
