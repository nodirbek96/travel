package com.nodir.insurance.districts;

import com.nodir.insurance.regions.RegionsModel;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DistrictOperationResultModel {
    private int result;
    private String description;
    private List<DistrictModel> districts;
}
