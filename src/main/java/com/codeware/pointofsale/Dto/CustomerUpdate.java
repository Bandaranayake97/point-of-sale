package com.codeware.pointofsale.Dto;

import java.util.ArrayList;

public class CustomerUpdate {
    private Integer customerId;
    private String customerName;
    private String customerAddes;
    private String customerEmail;

    public CustomerUpdate() {
    }

    public CustomerUpdate(Integer customerId, String customerName, String customerAddes, String customerEmail) {
        this.customerAddes = customerAddes;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
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
}
