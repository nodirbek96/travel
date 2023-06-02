package com.nodir.insurance.countries;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CountriesOperationResultModel {
    private int result;
    private String description;
    private List<RegionModel> regions;
}
