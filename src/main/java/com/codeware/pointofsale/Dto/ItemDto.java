package com.codeware.pointofsale.Dto;

import com.codeware.pointofsale.Entity.Enums.MeasuringUnitTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {
    private Integer itemId;
    private String itemsName;
    private MeasuringUnitTypes measuringtypes;
    private double balanceQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean active;

}
