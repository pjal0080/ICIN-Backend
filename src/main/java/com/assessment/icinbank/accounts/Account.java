package com.assessment.icinbank.accounts;

import com.assessment.icinbank.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "primary_account")
    private Long paccountNo;
    @Column(name = "savings_account")
    private Long saccountNo;

    @Column(name = "primary_balance")
    private Long pbalance;
    @Column(name = "savings_balance")
    private Long sbalance;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;


    public Account(Long paccountNo,
                   Long saccountNo,
                   Long pbalance,
                   Long sbalance,
                   User user) {
        this.paccountNo = paccountNo;
        this.saccountNo = saccountNo;
        this.pbalance = pbalance;
        this.sbalance = sbalance;
        this.user = user;
    }

}
