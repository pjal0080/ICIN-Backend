package com.assessment.icinbank.transactions;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "transfers")
@Data
@NoArgsConstructor
public class Transfer extends Transaction{

    private String senderAccountNo;
    private String receiverAccountNo;

    public Transfer(Long amount, LocalDate date, LocalTime time, String senderAccountNo, String receiverAccountNo) {
        super(amount, date, time);
        this.senderAccountNo = senderAccountNo;
        this.receiverAccountNo = receiverAccountNo;
    }
}
