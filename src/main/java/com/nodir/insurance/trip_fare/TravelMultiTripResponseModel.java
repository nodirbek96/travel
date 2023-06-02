package com.nodir.insurance.trip_fare;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TravelMultiTripResponseModel {
    @JsonProperty("operationResult")
    private TravelMultiTripOperationResultModel travelMultiTripOperationResultModel;
}
