package com.emisdep;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String clientName;
    private int clientPin;
    private List<SavingsAccount> savingsAccounts;
    private List<CheckingAccount> checkingAccounts;

    public Client(String clientName, int clientPin) {
        this.clientName = clientName;
        this.clientPin = clientPin;
        this.checkingAccounts = new ArrayList<CheckingAccount>();
        this.savingsAccounts = new ArrayList<SavingsAccount>();
    }

    }
