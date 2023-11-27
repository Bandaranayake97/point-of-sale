package com.codeware.pointofsale.Dto;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;

public class CustomerDto {
    private Integer customerId;
    private String customerName;
    private String customerAddes;
    private String customerEmail;
    private Integer customerNic;
    private ArrayList contactNumber;
    private boolean active;

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

    public CustomerDto() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public CustomerDto(Integer customerId, String customerName, String customerAddes, String customerEmail, Integer customerNic, ArrayList contactNumber, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddes = customerAddes;
        this.customerEmail = customerEmail;
        this.customerNic = customerNic;
        this.contactNumber = contactNumber;
        this.active = active;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
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
