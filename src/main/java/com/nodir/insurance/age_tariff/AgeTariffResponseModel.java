package com.nodir.insurance.age_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AgeTariffResponseModel {
    @JsonProperty("operationResult")
    private AgeTariffOperationResultModel ageTariffOperationResultModel;
}
