package com.nodir.insurance.age_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AgeTariffSettingModel {
    private int startAge;
    private int endAge;
    private String name;
    private String travelSettingId;
    private Number coefficient;
    private boolean useInMulti;
    private String id;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    @JsonProperty("isActive")
    private boolean active;
}
