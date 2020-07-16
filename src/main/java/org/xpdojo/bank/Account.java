package org.xpdojo.bank;

public class Account {
    Double balance = 0.0;

    public Double getBalance(){
        return 0.0;
    }

    public Double deposit(Double amount){
        return balance += amount;
    }

    public Double withdraw(Double amount){
        return balance -= amount;
    }

}
