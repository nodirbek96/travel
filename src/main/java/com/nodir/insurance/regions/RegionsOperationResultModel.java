package com.nodir.insurance.regions;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class RegionsOperationResultModel {
    private int result;
    private String description;
    private List<RegionsModel> regions;
}
