package com.nodir.insurance.regions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class RegionsResponseModel {
    @JsonProperty("operationResult")
    private RegionsOperationResultModel regionsOperationResultModel;
}
