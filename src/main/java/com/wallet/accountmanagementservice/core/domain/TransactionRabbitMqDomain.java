package com.wallet.accountmanagementservice.core.domain;

import com.wallet.accountmanagementservice.core.enumerated.TransactionType;

import java.math.BigDecimal;

public class TransactionRabbitMqDomain {
    private TransactionType transactionType;
    private String originAccount;
    private String destinationAccount;
    private BigDecimal value;

    public TransactionRabbitMqDomain(TransactionType transactionType, String originAccount, String destinationAccount, BigDecimal value) {
        this.transactionType = transactionType;
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
        this.value = value;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
