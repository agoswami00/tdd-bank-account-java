package org.xpdojo.bank;

public class Account {
    private Double balance = 0.0;

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
        if(amount > 0 && amount >=  balance)
            return balance -= amount;
        else
            return balance;
    }

}
