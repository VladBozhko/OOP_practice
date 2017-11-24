package com.company;

public class Car extends Vehicle {
    String bodytype;
    public int run (){
        return 70;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodytype='" + bodytype + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Car(String bodytype) {
        super (); // вызывает конструктор парента
        this.bodytype = bodytype;
    }

}
