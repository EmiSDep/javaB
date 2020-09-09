package com.emisdep;

public class DebitCard {

    private int cardNumber;
    private String accountName;
    private int dob;
    private int securityCode;

    private CheckingAccount checkingAccount;

    public DebitCard(int cardNumber, String accountName, int balance, int accountNum) {
        this.checkingAccount = new CheckingAccount();
//        checkingAccount.balance = balance;
//        checkingAccount.accountNum = accountNum;
        this.cardNumber=cardNumber;
        this.accountName=accountName;
    }

}
