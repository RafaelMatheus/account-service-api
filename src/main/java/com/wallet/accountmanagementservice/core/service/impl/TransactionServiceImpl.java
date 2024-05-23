package com.wallet.accountmanagementservice.core.service.impl;

import com.wallet.accountmanagementservice.core.domain.AccountDomain;
import com.wallet.accountmanagementservice.core.domain.TransactionDomain;
import com.wallet.accountmanagementservice.core.service.TransactionService;
import com.wallet.accountmanagementservice.core.strategy.TransactionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionServiceImpl implements TransactionService {
    private final Logger log = LoggerFactory.getLogger(TransactionService.class);
    private final TransactionFactory factory;

    public TransactionServiceImpl(TransactionFactory factory1) {
        this.factory = factory1;
    }

    @Override
    public AccountDomain executeAccountTransaction(TransactionDomain toTransactionDomain) {
        log.info("m=executeAccountTransaction, step=init, transactionType={}, accountNumber={}", toTransactionDomain.type(), toTransactionDomain.originAccountNumber());
        AccountDomain process = factory.get(toTransactionDomain.type())
            .process(toTransactionDomain);

        log.info("m=executeAccountTransaction, step=end, transactionType={}, accountNumber={}", toTransactionDomain.type(), toTransactionDomain.originAccountNumber());
        return process;
    }
}
