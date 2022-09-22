package com.cydeo.loosely;

import java.math.BigDecimal;

public class BalanceManager {




    public boolean checkout(Balance balance, BigDecimal checkoutAmount){
        // implement checkout business

        BigDecimal balanceAmount = balance.getAmount();
       return checkoutAmount.subtract(balance.getAmount())
               .compareTo(BigDecimal.ZERO) > 0;

    }
}
