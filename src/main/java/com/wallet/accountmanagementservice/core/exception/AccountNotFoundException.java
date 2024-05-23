package com.wallet.accountmanagementservice.core.exception;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(){
        super("We can not find any account with passed number, please try again later.");
    }
}
