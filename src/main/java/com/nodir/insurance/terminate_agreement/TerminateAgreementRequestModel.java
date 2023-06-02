package com.nodir.insurance.terminate_agreement;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TerminateAgreementRequestModel {
    private String agreementId;
    private LocalDateTime terminateDate;
}
