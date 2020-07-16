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

        Double balanceIncrease = finalBalance - initialBalance;
        assertThat(balanceIncrease.equals(100.50));
    }


}
