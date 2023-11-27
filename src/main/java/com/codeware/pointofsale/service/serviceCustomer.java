package com.codeware.pointofsale.service;

import com.codeware.pointofsale.Dto.CustomerDto;
import com.codeware.pointofsale.Dto.CustomerUpdate;

import java.util.List;

public interface serviceCustomer {


    public  String savecustomers(CustomerDto customerDto);


    CustomerDto updateCustomer(CustomerUpdate customerUpdate);

    CustomerDto getCustomerById(int customerId);

    String deleteCustomer(int customid);

    List<CustomerDto> getAllActive(boolean customerActive);

    List<CustomerDto> getallCustomer();
}
