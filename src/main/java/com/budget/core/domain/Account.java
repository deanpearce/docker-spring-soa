package com.budget.core.domain;

public class Account {

    private String userId;
    private String accountName;

    public Account() {
    }

    public Account(String userId, String accountName ) {
        this.userId = userId;
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
