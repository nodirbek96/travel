package com.nodir.insurance.ownership;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nodir.insurance.regions.RegionsOperationResultModel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OwnershipResponseModel {
    @JsonProperty("operationResult")
    private OwnershipOperationResultModel ownershipOperationResultModel;
}
