package com.example.bankingsystem_salut;

public class BigBank extends Bank{

    public BigBank(double loanAmount){super(loanAmount);}

    @Override
    public void computeInterest() {
        setInterest(getLoan_amount() *  (Math.pow(1 + (0.05/12), 12) - 1));
    }

}
