package com.nodir.insurance.tariff_program;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TravelOperationResultModel {
    private int result;
    @JsonProperty("data")
    private List<TravelProgramSettingModel> travelProgramSettingModels;
}
