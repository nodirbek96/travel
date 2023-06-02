package com.nodir.insurance.age_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AgeTariffOperationResultModel {
    private int result;
    private String errorMessage;
    @JsonProperty("data")
    private List<AgeTariffSettingModel> ageTariffSettingModels;
}
