package com.nodir.insurance.regions;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class RegionsModel {
    private String id;
    private String name;
    private String nameEn;
    private String nameUz;
    private int eosgoUzId;
}
