package com.callback;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Customer> customers = new ArrayList<>();

    //Register a customer.
    public void customerRegistration(Customer customer){
        customers.add(customer);
    }

    //Send sale invite.
    public void saleInvite(){
        //Loop through the list.
        for (Customer customer : customers){
            System.out.println("Sending invite to : " + customer.name);
            customer.callback();
        }
    }


}
