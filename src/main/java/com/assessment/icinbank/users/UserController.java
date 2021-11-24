package com.assessment.icinbank.users;

import com.assessment.icinbank.accounts.*;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;
    private final AccountService accountService;

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

}
