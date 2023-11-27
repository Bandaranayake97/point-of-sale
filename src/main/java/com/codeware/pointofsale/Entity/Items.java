package com.codeware.pointofsale.Entity;

import com.codeware.pointofsale.Entity.Enums.MeasuringUnitTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "items")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "items_id" , length = 10)
    private Integer itemId;

    @Column(name = "items_name",length = 50)
    private String itemsName;

    @Enumerated(EnumType.STRING)
    @Column(name = "measuring_types", length = 25,nullable = false)
    private MeasuringUnitTypes measuringtypes;

    @Column(name = "balance_qty" , length = 50)
    private double balanceQty;

    @Column(name = "supplier_price",length = 100,nullable = false)
    private double supplierPrice;

    @Column(name = "selling_price", length = 100,nullable = false)
    private double sellingPrice;

    @Column(name = "active", columnDefinition = "TINYINT default 1")
    private boolean active;

    @OneToMany(mappedBy = "items")
    private Set<orderDetails> orderDetails;
}
