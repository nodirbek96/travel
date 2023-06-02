package com.nodir.insurance.contract;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class InsuredPersonModel {
    private int residentTypeId;
    private String firstName;
    private String lastName;
    private String surName;
    private String firstNameEn;
    private String lastNameEn;
    private String phone;
    private String address;
    private String passportSeries;
    private String passportNumber;
    private LocalDateTime passportIssueDate;
    private LocalDateTime passportExpirationDate;
    private String passportAuthority;
    private String pinfl;
    private LocalDateTime birthday;
    private int countryId;
    private int regionIdForEosgoUz;
    private String districtIdForEosgoUz;
    private int age;
    private String specialConditions;
    private int premiumAmount;
    private Number coefficient;
}
