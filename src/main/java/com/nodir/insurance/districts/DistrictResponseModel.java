package com.nodir.insurance.districts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nodir.insurance.regions.RegionsOperationResultModel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DistrictResponseModel {
    @JsonProperty("operationResult")
    private DistrictOperationResultModel districtOperationResultModel;
}
