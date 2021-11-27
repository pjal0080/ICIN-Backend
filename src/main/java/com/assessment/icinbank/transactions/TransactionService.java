package com.assessment.icinbank.transactions;

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

    public void depositToPrimary(Long amount,Long id){
        User user = userRepository.findByUserId(id);
        transactionHistoryRepository.save(new TransactionHistory(
                amount,
                LocalDate.now(),
                LocalTime.now(),
                user.getPrimaryAccount().getAccountNo(),
                user,
                TransactionType.deposit
        ));
    }

    public void withdrawFromPrimary(Long id){

    }

    public void transfer(){

    }

}
