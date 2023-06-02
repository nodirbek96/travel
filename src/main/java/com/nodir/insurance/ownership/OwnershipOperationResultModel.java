package com.nodir.insurance.ownership;

import com.nodir.insurance.regions.RegionsModel;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OwnershipOperationResultModel {
    private int result;
    private String description;
    private List<OwnershipFormModel> ownershipFormTypes;
}
