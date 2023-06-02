package com.nodir.insurance.tariff_program;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgrammesTariffResponseModel {
    @JsonProperty("operationResult")
    private TravelOperationResultModel travelOperationResultModel;
}
