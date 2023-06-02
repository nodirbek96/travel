package com.nodir.insurance.contract;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CreateAgreementRequestModel {
    private AgreementModel agreement;
    private ClientModel client;
    private List<InsuredPersonModel> insuredPersons;
}
