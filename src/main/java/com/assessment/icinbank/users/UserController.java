package com.assessment.icinbank.users;

import com.assessment.icinbank.accounts.*;
import com.assessment.icinbank.checkbook.CheckBookRequest;
import com.assessment.icinbank.transactions.TransactionHistoryRequest;
import com.assessment.icinbank.transactions.TransactionService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;
    private final AccountService accountService;
    private final TransactionService transactionService;

    @GetMapping("/userprofile/{email}")
    public Optional<User> sendUserProfile(@PathVariable String email){ return userService.userProfile(email); }

    @GetMapping("/account/primary/{id}")
    @JsonView(AccountView.Base.class)
    public Optional<PrimaryAccount> getPrimaryAccountById(@PathVariable Long id){
        return accountService.getPrimaryAccountDetails(id);
    }

    @GetMapping("/account/savings/{id}")
    @JsonView(AccountView.Savings.class)
    public Optional<SavingsAccount> getSavingsAccountById(@PathVariable Long id){
        return accountService.getSavingsAccountDetails(id);
    }

    @PostMapping("/request/checkbook")
    public void requestCheckBook(@RequestBody CheckBookRequest checkBookRequest){
       userService.requestCheckbook(checkBookRequest);
    }

    @GetMapping("/checkbook/status/{userid}")
    public Boolean getCheckBookStatus(@PathVariable Long userId){
        return userService.getCheckBookStatus(userId);
    }

    @PostMapping("/deposit/primary")
    public void depositToPrimaryAccount(@RequestBody TransactionHistoryRequest transactionHistoryRequest){
            transactionService.depositToPrimary(transactionHistoryRequest.getAmount(),transactionHistoryRequest.getId());
    }

}
