package com.company;

public class Vehicle {
    protected String name = "noname";
    protected int id = 0;
    public int run (){
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Vehicle() {
    }

    public Vehicle(String name, int id) {
        this.name = name;
        this.id = id;

    }
}
