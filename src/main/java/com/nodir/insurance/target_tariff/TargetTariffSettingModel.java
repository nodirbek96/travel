package com.nodir.insurance.target_tariff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TargetTariffSettingModel {
    private String name;
    private String nameEn;
    private String travelSettingId;
    private Number coefficient;
    private boolean useInMulti;
    private String id;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    @JsonProperty("isActive")
    private boolean active;
}
