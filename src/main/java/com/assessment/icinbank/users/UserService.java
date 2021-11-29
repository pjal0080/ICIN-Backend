package com.assessment.icinbank.users;

import com.assessment.icinbank.checkbook.CheckBook;
import com.assessment.icinbank.checkbook.CheckBookRepository;
import com.assessment.icinbank.checkbook.CheckBookRequest;
import com.assessment.icinbank.transactions.TransactionHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final CheckBookRepository checkBookRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findUserByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("username with email %s not found",email)));

    }

    public void registerNewUser(User newUser){

        Optional<User> user = userRepository.findUserByEmail(newUser.getEmail());

        System.out.println(user);
        if(user.isPresent()){
            throw new IllegalStateException("Email already exists");
        }
            String encodedPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
            newUser.setPassword(encodedPassword);
            newUser.setEnabled(false);
            userRepository.save(newUser);

    }

    public Optional<User> userProfile(String email){
        return userRepository.findUserByEmail(email);
    }

    public List<User> userProfiles(){
        return userRepository.findAllByUserRole("USER");
    }

    public void enableProfile(String email){
        User user = (User) loadUserByUsername(email);
        user.setEnabled(true);
        userRepository.save(user);
    }

    public void disableProfile(String email){
        User user = (User) loadUserByUsername(email);
        user.setEnabled(false);
        userRepository.save(user);
    }


    public void requestCheckbook(CheckBookRequest checkBookRequest) throws UsernameNotFoundException{
        User user = (User) loadUserByUsername(checkBookRequest.getUsername());
        if(user != null){
            checkBookRepository.save(new CheckBook(
                    user.getUsername(),
                    user.getId(),
                    checkBookRequest.getAccountType(),
                    false
            ));
        }
        else{
            throw new UsernameNotFoundException(String.format("User with email %s not found",checkBookRequest.getUsername()));
        }

    }

    public Boolean getCheckBookStatus(Long userId){
           CheckBook checkBook = checkBookRepository.findByUserId(userId);
           return checkBook.getCheckBookStatus();
    }


    public List<TransactionHistory> getAllUserTransactions(Long id) {
        User user = userRepository.findByUserId(id);
        return user.getTransactionHistoryList();
    }
}
