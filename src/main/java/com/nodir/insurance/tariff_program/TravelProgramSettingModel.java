package com.nodir.insurance.tariff_program;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TravelProgramSettingModel {
    private String travelSettingId;
    private String name;
    private int territoryId;
    private String territoryName;
    private String singleTripSettings;
    private String multiTripSettings;
    private String id;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    @JsonProperty("isActive")
    private boolean active;
}
