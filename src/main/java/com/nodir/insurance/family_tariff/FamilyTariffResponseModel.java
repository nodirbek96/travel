package com.nodir.insurance.family_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class FamilyTariffResponseModel {
    @JsonProperty("operationResult")
    private FamilyTariffOperationResultModel familyTariffOperationResultModel;
}
