package com.nodir.insurance.group_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class GroupTariffResponseModel {
    @JsonProperty("operationResult")
    private GroupTariffOperationResultModel groupTariffOperationResultModel;
}
