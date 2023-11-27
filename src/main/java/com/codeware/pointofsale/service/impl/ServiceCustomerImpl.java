package com.codeware.pointofsale.service.impl;

import com.codeware.pointofsale.Dto.CustomerDto;
import com.codeware.pointofsale.Dto.CustomerUpdate;
import com.codeware.pointofsale.Entity.Customerr;
import com.codeware.pointofsale.excaption.NotFoundException;
import com.codeware.pointofsale.repo.CustomerRepo;
import com.codeware.pointofsale.service.serviceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCustomerImpl implements serviceCustomer {
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public String savecustomers(CustomerDto customerDto) {
        Customerr customer = new Customerr(
                customerDto.getCustomerId(),
                customerDto.getCustomerName(),
                customerDto.getCustomerAddes(),
                customerDto.getCustomerEmail(),
                customerDto.getCustomerNic(),
                customerDto.getContactNumber(),
                customerDto.isActive()
        );
        customerRepo.save(customer);
        return "succes";
    }

    @Override
    public CustomerDto updateCustomer(CustomerUpdate customerUpdate) {
        if (customerRepo.existsById(customerUpdate.getCustomerId())) {
            Customerr customerr = customerRepo.getReferenceById(customerUpdate.getCustomerId());
            customerr.setCustomerId(customerUpdate.getCustomerId());
            customerr.setCustomerName(customerUpdate.getCustomerName());
            customerr.setCustomerAddes(customerUpdate.getCustomerAddes());
            customerr.setCustomerEmail(customerUpdate.getCustomerEmail());
            customerRepo.save(customerr);
            CustomerDto customerDto = new CustomerDto(
                    customerr.getCustomerId(),
                    customerr.getCustomerName(),
                    customerr.getCustomerAddes(),
                    customerr.getCustomerEmail(),
                    customerr.getCustomerNic(),
                    customerr.getContactNumber(),
                    customerr.isActive()
            );
            return customerDto;
        } else {
            throw new RuntimeException("not in a customer");
        }

    }

    @Override
    public CustomerDto getCustomerById(int customerId) {
        if (customerRepo.existsById(customerId)) {
            Customerr customerr = customerRepo.getReferenceById(customerId);
            CustomerDto customerDto = new CustomerDto(
                    customerr.getCustomerId(),
                    customerr.getCustomerName(),
                    customerr.getCustomerAddes(),
                    customerr.getCustomerEmail(),
                    customerr.getCustomerNic(),
                    customerr.getContactNumber(),
                    customerr.isActive()

            );
            return customerDto;
        } else {
            throw new RuntimeException("absernt customer");
        }
    }

    @Override
    public String deleteCustomer(int customid) {
        if (customerRepo.existsById(customid)) {
            customerRepo.deleteById(customid);
            return "delete {customid}";
        } else {
            throw new RuntimeException("customer not avalerbel");
        }

    }

    @Override
    public List<CustomerDto> getAllActive(boolean customerActive) {
        List<Customerr> customerrs = customerRepo.findAllByActiveEquals(customerActive);
        List<CustomerDto> customerDtos = new ArrayList<>();
        for(Customerr customerr : customerrs){
            CustomerDto customerDto = new CustomerDto(
                    customerr.getCustomerId(),
                    customerr.getCustomerName(),
                    customerr.getCustomerAddes(),
                    customerr.getCustomerEmail(),
                    customerr.getCustomerNic(),
                    customerr.getContactNumber(),
                    customerr.isActive()
            );
            customerDtos.add(customerDto);
        }

        return customerDtos;
    }

    @Override
    public List<CustomerDto> getallCustomer() {
        List<Customerr> customerrs = customerRepo.findAll();
        if(customerrs.size()>0){
        List<CustomerDto> customerlist = new ArrayList<>();
        for(Customerr customerr : customerrs){
            CustomerDto customerDto = new CustomerDto(
                    customerr.getCustomerId(),
                    customerr.getCustomerName(),
                    customerr.getCustomerAddes(),
                    customerr.getCustomerEmail(),
                    customerr.getCustomerNic(),
                    customerr.getContactNumber(),
                    customerr.isActive()
            );
            customerlist.add(customerDto);
        }
        return customerlist;
    }else{
            throw new NotFoundException("No Customer Found");
        }
    }

}