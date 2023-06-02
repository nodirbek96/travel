package com.nodir.insurance.family_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class FamilyTariffOperationResultModel {
    private int result;
    private String errorMessage;
    @JsonProperty("data")
    private List<FamilyTariffSettingModel> familyTariffSettingModels;
}
