package com.codeware.pointofsale.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;

@Entity
@Table(name = "Order_details")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class orderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id" , length = 10)
    private Integer orderId;

    @Column(name = "items_name",length = 50)
    private String itemsName;

    @Column(name = "qty" , length = 50)
    private double    Qty;

    @Column(name = "amount", length = 100,nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "orders_id",nullable = false)
    private  order orders ;

    @ManyToOne
    @JoinColumn(name = "item_id",nullable = false)
    private Items items ;

}
