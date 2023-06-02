package com.nodir.insurance.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OperationResult {
    private int result;
    private String errorMessage;
    //private String description;
    @JsonProperty("data")
    private ContractDataModel contractDataModel;
}
