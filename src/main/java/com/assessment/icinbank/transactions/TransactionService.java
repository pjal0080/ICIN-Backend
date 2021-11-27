package com.assessment.icinbank.transactions;


import com.assessment.icinbank.accounts.PrimaryAccount;
import com.assessment.icinbank.accounts.PrimaryAccountRepository;
import com.assessment.icinbank.accounts.SavingsAccountRepository;
import com.assessment.icinbank.users.User;
import com.assessment.icinbank.users.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionHistoryRepository transactionHistoryRepository;
    private final TransferRepository transferRepository;
    private final UserRepository userRepository;
    private final PrimaryAccountRepository primaryAccountRepository;
    private final SavingsAccountRepository savingsAccountRepository;

    public void depositToPrimary(Long amount,Long id){
        User user = userRepository.findByUserId(id);
        PrimaryAccount userAccount = user.getPrimaryAccount();
        Long newAmount = userAccount.getBalance() + amount;
        userAccount.setBalance(newAmount);
        primaryAccountRepository.save(userAccount);


        transactionHistoryRepository.save(new TransactionHistory(
                amount,
                LocalDate.now(),
                LocalTime.now(),
                userAccount.getAccountNo(),
                user,
                TransactionType.deposit
        ));
    }

    public void withdrawFromPrimary(Long amount,Long id) throws Exception {
        User user = userRepository.findByUserId(id);
        PrimaryAccount userAccount = user.getPrimaryAccount();
        Long oldAmount = userAccount.getBalance();
        if(oldAmount < amount || oldAmount == 0){
            throw new Exception("Amount can not be withdrawn");
        }

        else{
            Long newAmount = oldAmount - amount;
            userAccount.setBalance(newAmount);
            primaryAccountRepository.save(userAccount);

            transactionHistoryRepository.save(new TransactionHistory(
                    amount,
                    LocalDate.now(),
                    LocalTime.now(),
                    userAccount.getAccountNo(),
                    user,
                    TransactionType.withdrawal
            ));

        }


    }

    public void transfer(){

    }

}

