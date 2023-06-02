package com.nodir.insurance.payment_cancel;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PaymentCancelRequestBody {
    private String agreementId;
}
