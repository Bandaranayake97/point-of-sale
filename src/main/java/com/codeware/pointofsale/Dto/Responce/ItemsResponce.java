package com.codeware.pointofsale.Dto.Responce;

import com.codeware.pointofsale.Entity.Enums.MeasuringUnitTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemsResponce {

    private Integer itemId;
    private String itemsName;
    private double balanceQty;
    private double sellingPrice;
    private boolean active;
}
