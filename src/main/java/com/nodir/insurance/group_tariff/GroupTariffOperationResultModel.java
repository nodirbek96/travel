package com.nodir.insurance.group_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class GroupTariffOperationResultModel {
    private int result;
    private String errorMessage;
    @JsonProperty("data")
    private List<GroupTariffSettingModel> groupTariffSettingModels;
}
