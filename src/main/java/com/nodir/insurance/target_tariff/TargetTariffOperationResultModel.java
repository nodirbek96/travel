package com.nodir.insurance.target_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nodir.insurance.trip_fare.TravelMultiTripSettingModel;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TargetTariffOperationResultModel {
    private int result;
    @JsonProperty("data")
    private List<TravelMultiTripSettingModel> travelMultiTripSettingModels;
    private String errorMessage;
}
