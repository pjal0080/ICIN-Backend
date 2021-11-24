package com.assessment.icinbank.accounts;

import com.assessment.icinbank.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "savings_account")
@NoArgsConstructor
public class SavingsAccount extends Account{

    @JsonView(AccountView.Savings.class)
    @Column(name = "interest_rate")
    private Integer rate;

    public SavingsAccount(Long balance,
                          String accountNo,
                          User user,
                          Integer rate) {
        super(balance, accountNo, user);
        this.rate = rate;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

}
