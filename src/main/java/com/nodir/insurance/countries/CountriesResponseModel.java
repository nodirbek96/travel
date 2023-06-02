package com.nodir.insurance.countries;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CountriesResponseModel {
    @JsonProperty("operationResult")
    private CountriesOperationResultModel countriesOperationResultModel;
}
