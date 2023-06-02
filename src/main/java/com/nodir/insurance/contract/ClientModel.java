package com.nodir.insurance.contract;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ClientModel {
    private int legalTypeId;
    private int residentTypeId;
    private String firstName;
    private String lastName;
    private String surName;
    private String firstNameEn;
    private String lastNameEn;
    private String phone;
    private String pinfl;
    private String address;
    private boolean gender;
    private LocalDateTime birthday;
    private String passportSeries;
    private String passportNumber;
    private LocalDateTime passportIssueDate;
    private LocalDateTime passportExpirationDate;
    private String passportAuthority;
    private int countryId;
    private int regionIdForEosgoUz;
    private String districtIdForEosgoUz;
}
