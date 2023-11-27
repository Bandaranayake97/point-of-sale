package com.codeware.pointofsale.controler;

import com.codeware.pointofsale.Dto.CustomerDto;
import com.codeware.pointofsale.Dto.CustomerUpdate;
import com.codeware.pointofsale.service.serviceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerControler {

    @Autowired
    private serviceCustomer servicecustomer;

    @PostMapping("save")
    public String saveCustomer(@RequestBody CustomerDto customerDto){
        servicecustomer.savecustomers(customerDto);
        return "succes";
    }

    @PostMapping("/get-by-name")
    public String getcustomer(@RequestBody CustomerDto customerDto){
        String masage = customerDto.getCustomerName();
        return masage;
    }
    @GetMapping("get-all")
    public List<CustomerDto> getAllCustomer(){
        List<CustomerDto> customerDtos = servicecustomer.getallCustomer();
        return customerDtos;
    }

    @PostMapping(path = "/update")
    public CustomerDto updateCustomer(@RequestBody CustomerUpdate customerUpdate){
        CustomerDto customer = servicecustomer.updateCustomer(customerUpdate);
        return customer;
    }

    @GetMapping(path = "/get-by-id",params = "id")
    public CustomerDto getCustomerById(@RequestParam(value = "id") int customerId){
    CustomerDto customerDto = servicecustomer.getCustomerById(customerId);
    return customerDto;
    }

    @DeleteMapping("delete-by-id/{id}")
    public String deleteCustomer(@RequestParam(value = "id") int customid){
       String massage = servicecustomer.deleteCustomer(customid);
       return massage;
    }

    @GetMapping("get-active-all/{status}")
        public List<CustomerDto> getActiveAll(@RequestParam(value = "status") boolean customerActive){
        List<CustomerDto> customerDtos = servicecustomer.getAllActive(customerActive);
        return customerDtos;
    }




}
