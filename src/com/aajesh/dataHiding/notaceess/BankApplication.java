package com.aajesh.dataHiding.notaceess;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer= new Customer();
        //customer.balance=-1000;
        customer.deposit(2000);
    }
}