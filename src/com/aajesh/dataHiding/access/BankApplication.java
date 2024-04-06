package com.aajesh.dataHiding.access;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer= new Customer();
        customer.balance=-1000;
        customer.deposit(2000);
       // System.out.println(customer.balance);
    }
}
