package com.wallet.accountmanagementservice.core.domain;

import java.math.BigDecimal;

public class AccountDomain {
    private String id;
    private String holderTaxId;
    private String holderName;
    private String phoneNumber;
    private BigDecimal balance;
    private String accountNumber;

    public AccountDomain(String id, String holderTaxId, String holderName, String phoneNumber, BigDecimal balance, String accountNumber) {
        this.id = id;
        this.holderTaxId = holderTaxId;
        this.holderName = holderName;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public AccountDomain() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHolderTaxId() {
        return holderTaxId;
    }

    public void setHolderTaxId(String holderTaxId) {
        this.holderTaxId = holderTaxId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
