package com.nodir.insurance.payment_confirm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class PaymentConfirmRequestModel {
    private String agreementId;
    private String fullNumber;
    private int accountType;
    private LocalDateTime paymentDate;
    private LocalDateTime periodStartDate;
    private LocalDateTime periodEndDate;
}
