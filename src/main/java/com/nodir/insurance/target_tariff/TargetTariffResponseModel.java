package com.nodir.insurance.target_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TargetTariffResponseModel {
    @JsonProperty("operationResult")
    private TargetTariffOperationResultModel targetTariffOperationResultModel;
}
