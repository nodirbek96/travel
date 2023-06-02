package com.nodir.insurance.trip_fare;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TravelMultiTripSettingModel {
    private String travelSettingId;
    private String programId;
    private String programName;
    private String name;
    private int maxPolicyPeriod;
    private int travelTime;
    @JsonProperty("isEveryTrip")
    private boolean everyTrip;
    private Number startInsurancePremiumForOnePersonForEntirePeriod;
    private Number endInsurancePremiumForOnePersonForEntirePeriod;
    private String id;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    @JsonProperty("isActive")
    private boolean active;
}
