package com.assessment.icinbank.admin;

import com.assessment.icinbank.users.User;
import com.assessment.icinbank.users.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserService userService;

    @GetMapping("/profile/{email}")
    public Optional<User> getAdminDetails(@PathVariable String email){
        return userService.userProfile(email);
    }

}
