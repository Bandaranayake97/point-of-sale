package com.codeware.pointofsale.Entity;

import com.codeware.pointofsale.Entity.Enums.MeasuringUnitTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id" , length = 10)
    private Integer orderId;

    @Column(name = "order_date" , length = 50)
    private Date orderdate ;

    @Column(name = "total", length = 100,nullable = false)
    private double total;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customerr customer;

    @OneToMany(mappedBy = "orders")
    private Set<orderDetails> orderDetails;


}
