package com.callback;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rameez");
        Customer customer1 = new Customer("Nimra");

        Store store = new Store();

        //Rameez Registered.
        store.customerRegistration(customer);
        store.customerRegistration(customer1);

        //Send call to rameez.
        store.saleInvite();
    }
}
