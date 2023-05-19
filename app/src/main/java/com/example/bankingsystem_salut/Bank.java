package com.example.bankingsystem_salut;

public class Bank {
    private double loan_ant;

    private double interest;

    Bank(){this.loan_ant = 0;}

    Bank(double loan_ant){this.loan_ant = loan_ant;}

    public void computeInterest(){
        int rate = 0;
        interest = loan_ant * (Math.pow((1 + rate / 12),12)- 1);
    }

    public double returnInterest(){return interest;}

    public void setInterest(double interest){this.interest = interest;}

    public double getLoan_amount(){return loan_ant;}
}
