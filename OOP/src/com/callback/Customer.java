package com.callback;

public class Customer implements Member {

    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("I will visit..." + this.name);
    }
}
