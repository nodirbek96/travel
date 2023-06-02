package com.nodir.insurance.trip_fare;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TravelMultiTripOperationResultModel {
    private int result;
    @JsonProperty("data")
    private List<TravelMultiTripSettingModel> travelMultiTripSettingModels;
}
