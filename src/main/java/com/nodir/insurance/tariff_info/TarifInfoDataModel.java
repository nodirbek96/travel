package com.nodir.insurance.tariff_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TarifInfoDataModel {
    private String name;
    private boolean baggageInsured;
    private Number baggageInsuredAmount;
    private int insuredCurrencyId;
    private String insuredCurrencyName;
    private int premiumCurrencyId;
    private String premiumCurrencyName;
    private int clientTypeId;
    private String clientTypeName;
    private int insuredPersonsCount;
    private int daysCountForSchengen;
    private int schengenMaxPeriod;
    private boolean allowAddAgreementWithOldDate;
    private boolean allowSwitchAgentAccountType;
    @JsonProperty("isMain")
    private boolean main;
    private String id;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    @JsonProperty("isActive")
    private String active;
}
