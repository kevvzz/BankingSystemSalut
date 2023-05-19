package com.example.bankingsystem_salut;

public class SmallBank extends Bank{

    public SmallBank(double loanAmount){super(loanAmount);}

    @Override
    public void computeInterest() {
        setInterest(getLoan_amount() *  (Math.pow(1 + (0.03/12), 12) - 1));
    }
}
