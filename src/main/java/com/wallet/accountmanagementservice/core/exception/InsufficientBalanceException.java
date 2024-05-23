package com.wallet.accountmanagementservice.core.exception;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(){
        super("You do not balance for this transaction, try again later.");
    }
}
