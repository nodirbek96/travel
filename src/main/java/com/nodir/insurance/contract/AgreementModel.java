package com.nodir.insurance.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AgreementModel {
    private String agentId;
    private LocalDateTime agreementDate;
    private LocalDateTime periodStartDate;
    private LocalDateTime periodEndDate;
    private LocalDateTime periodEndDateTypeName;
    private int premiumAmount;
    private String premiumCurrencyName;
    private Number premiumAmountInSum;
    private Number insuredAmount;
    private String insuredAmountCurrencyName;
    private int daysCount;
    @JsonProperty("isBaggageInsured")
    private boolean baggageInsured;
    private int daysCountForSchengen;
    @JsonProperty("isShengen")
    private boolean shengen;
    private int travelMultipleTypeId;
    private String destinationCountries;
    private String travelProgramId;
    private String travelProgramName;
    private String travelTargetTariffId;
    private String travelTargetTariffName;
    private String travelGroupTariffId;
    private String travelGroupTariffName;
    private String travelFamilyTariffId;
    private String travelFamilyTariffName;
    private String travelHealthProtectionTariffId;
    private String travelHealthProtectionTariffName;
}
