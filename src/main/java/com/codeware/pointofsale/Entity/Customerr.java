package com.codeware.pointofsale.Entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "customer")
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)
})
public class Customerr {
    @Id
    @Column(name = "customer_id",length = 10)
    private Integer customerId;
    @Column(name="customer_name", length = 50)
    private String customerName;
    @Column(name="customer_addres",length = 100)
    private String customerAddes;
    @Column(name="customer_email", length = 50)
    private String customerEmail;
    @Column(name="customer_Nic",length = 20)
    private Integer customerNic;

    @Type(type= "json")
    @Column(name = "cantact_number", columnDefinition = "json")
    private ArrayList contactNumber;

    @Column(name = "active")
    private boolean active;

    @OneToMany(mappedBy = "customer")
    private Set<order> orders;

    public Customerr(Integer customerId, String customerName, String customerAddes, String customerEmail, Integer customerNic, ArrayList contactNumber, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddes = customerAddes;
        this.customerEmail = customerEmail;
        this.customerNic = customerNic;
        this.contactNumber = contactNumber;
        this.active = active;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddes() {
        return customerAddes;
    }

    public void setCustomerAddes(String customerAddes) {
        this.customerAddes = customerAddes;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Integer getCustomerNic() {
        return customerNic;
    }

    public void setCustomerNic(Integer customerNic) {
        this.customerNic = customerNic;
    }

    public ArrayList getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Customerr{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddes='" + customerAddes + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerNic=" + customerNic +
                ", contactNumber=" + contactNumber +
                ", active=" + active +
                '}';
    }
}
