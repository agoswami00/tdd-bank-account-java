package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountCreatedHasZeroBalanace() {
        Account acc = new Account();
        assertThat(acc.getBalance().equals(0));
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account acc = new Account();
        Double initialBalance = acc.getBalance();
        acc.deposit(100.50);
        Double finalBalance = acc.getBalance();

        Double balanceDiff = finalBalance - initialBalance;
        assertThat(balanceDiff.equals(100.50));
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account acc = new Account();
        Double initialBalance = acc.getBalance();
        acc.withdraw(100.50);
        Double finalBalance = acc.getBalance();

        Double balanceDiff = initialBalance - finalBalance;
        assertThat(balanceDiff.equals(100.50));
    }

}
