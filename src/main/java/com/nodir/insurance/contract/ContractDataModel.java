package com.nodir.insurance.contract;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ContractDataModel {
    private String agreementId;
    private String fullNumber;
    private LocalDateTime agreementDate;
    private int statusId;
    private String statusDescription;
    private boolean creationDate;
    private String paymentCode;
}
