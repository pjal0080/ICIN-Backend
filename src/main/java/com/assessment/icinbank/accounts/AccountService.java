package com.assessment.icinbank.accounts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final PrimaryAccountRepository primaryAccountRepository;
    private final SavingsAccountRepository savingsAccountRepository;

    public void createPrimaryAccount(PrimaryAccount primaryAccount){
        primaryAccountRepository.save(primaryAccount);
    }

    public void createSavingsAccount(SavingsAccount savingsAccount){
        savingsAccountRepository.save(savingsAccount);
    }
}
