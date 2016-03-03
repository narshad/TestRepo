package com.example.controller;

import com.example.exception.CustomerNotFoundException;
import com.example.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by narshad on 02/03/16.
 */
@Controller
@RequestMapping("/customers")
public class CustomerController {
    private static List<Customer> list = new ArrayList<Customer>();

    static{
        list.add(new Customer(1l,"Johnny"));
        list.add(new Customer(2l,"Tommy"));
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public static List<Customer> getAllCustomers() {
        return list;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Customer getCustomer(@PathVariable("id") Long id ) {
        for(Customer c: list){
            if(c.getId().equals(id)){
                return c;
            }
        }
        throw new CustomerNotFoundException();
    }



    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addCustomer(@RequestBody Customer customer)
    {
        list.add(customer);
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Customer updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer){
        for(Customer c: list){
            if(c.getId().equals(id)){
                c.setName(customer.getName());
            }
        }
        return customer;
    }


    @RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable("id") Long id){
        Customer rCust = null;
        for(Customer c : list){
            if(c.getId().equals(id)){
                rCust = c;
            }
        }
        if(rCust == null) {
            throw new CustomerNotFoundException();
        }
        else{
            list.remove(rCust);
        }
    }
}
