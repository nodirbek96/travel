package com.nodir.insurance.tariff_info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TariffInfoResponseModel {
    @JsonProperty("operationResult")
    private TarifInfoOperationModel tarifInfoOperationModel;
}
