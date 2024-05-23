package com.wallet.accountmanagementservice.core.service.impl;

import com.wallet.accountmanagementservice.core.domain.AccountDomain;
import com.wallet.accountmanagementservice.core.exception.AccountNotFoundException;
import com.wallet.accountmanagementservice.core.port.AccountPort;
import com.wallet.accountmanagementservice.core.service.AccountService;

import java.math.BigDecimal;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AccountServiceImpl implements AccountService {
    private final AccountPort port;
    private final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    public AccountServiceImpl(AccountPort port) {
        this.port = port;
    }

    @Override
    public AccountDomain generateAccount(AccountDomain accountDomain) {
        log.info("m=generateAccount, step=init");
        accountDomain.setAccountNumber(UUID.randomUUID().toString());
        accountDomain.setBalance(BigDecimal.ZERO);
        AccountDomain saved = port.save(accountDomain);
        log.info("m=generateAccount, step=end, accountNumber={}", accountDomain.getAccountNumber());
        return saved;
    }

    @Override
    public AccountDomain getAccountInformation(String accountNumber) {
        log.info("m=getAccountInformation, step=init, accountNumber={}", accountNumber);

        AccountDomain accountDomain = port.findByAccountNumber(accountNumber)
            .orElseThrow(AccountNotFoundException::new);
        log.info("m=getAccountInformation, step=end, accountNumber={}", accountNumber);
        return accountDomain;
    }
}
