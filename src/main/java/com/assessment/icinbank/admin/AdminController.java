package com.assessment.icinbank.admin;


import com.assessment.icinbank.accounts.AccountService;
import com.assessment.icinbank.accounts.PrimaryAccount;
import com.assessment.icinbank.accounts.SavingsAccount;
import com.assessment.icinbank.checkbook.CheckBook;
import com.assessment.icinbank.checkbook.CheckBookService;
import com.assessment.icinbank.users.User;
import com.assessment.icinbank.users.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserService userService;
    private final AccountService accountService;
    private final CheckBookService checkBookService;

    @GetMapping("/profile/{email}")
    public Optional<User> getAdminDetails(@PathVariable String email){
        return userService.userProfile(email);
    }


    @GetMapping("/profiles")
    public List<User> getAllUsers(){
        return userService.userProfiles();
    }

    @PostMapping("/activate/{email}")
    public void activateProfile(@PathVariable String email){
        userService.enableProfile(email);
    }

    @PostMapping("/deactivate/{email}")
    public void deactivateProfile(@PathVariable String email){
        userService.disableProfile(email);
    }

    @PostMapping("/create_primary")
    public void createPrimaryAccount(@RequestBody PrimaryAccount primaryAccount){
        accountService.createPrimaryAccount(primaryAccount);
    }

    @PostMapping("/create_savings")
    public void createSavingsAccount(@RequestBody SavingsAccount savingsAccount){
        accountService.createSavingsAccount(savingsAccount);
    }

    @GetMapping("/checkbooks")
    public List<CheckBook> getCheckbookRequests(){
        return checkBookService.getAllCheckBooks();
    }

    @PostMapping("/checkbook/confirm/{userid}")
    public void confirmCheckBookRequest(@PathVariable Long userId){
        checkBookService.grantCheckBook(userId);
    }


}
