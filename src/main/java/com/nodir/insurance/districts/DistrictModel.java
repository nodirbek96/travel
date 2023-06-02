package com.nodir.insurance.districts;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DistrictModel {
    private String id;
    private String name;
    private String nameEn;
    private String nameUz;
    private int eosgoUzId;
}
