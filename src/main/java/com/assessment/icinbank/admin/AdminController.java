package com.assessment.icinbank.admin;

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


}
