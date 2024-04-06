package com.aajesh.pojo;

public class Employee {

    private int id;
    private String name;
    private String address;

    public void setValues(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
