package com.emisdep;

public class CreditAccount extends BankAccount {
    public CreditAccount(int accountNum, int balance, String owner) {
        super(accountNum, balance, owner, "Credit");
    }
}