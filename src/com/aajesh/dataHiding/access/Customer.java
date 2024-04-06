package com.aajesh.dataHiding.access;

/*
This is customer class which is not define the instance variable as private outside class
easily access customer class instance variable name balance base on need that class modify the value

* */
public class Customer {
    double balance=10000;
    public void deposit(int amount){
        balance = balance+amount;
        System.out.println("after deposit balance :"+balance);
    }

    public void withdraw(int amount){
        balance= balance-amount;
        System.out.println("after withdraw balance :"+balance);
    }

}