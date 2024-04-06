package com.aajesh.dataHiding.notaceess;

public class Customer {
   private double balance=10000;
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("your are a hacker");
        }else {
            balance = balance + amount;
            System.out.println("after deposit balance :" + balance);
        }
    }

    public void withdraw(int amount){
        balance= balance-amount;
        System.out.println("after withdraw balance :"+balance);
    }
}