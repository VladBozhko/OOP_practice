package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); // prints Hello World
        Vehicle v = new Vehicle ( "zaporogec" , 27);
        Car c = new Car ("otstoi");
        System.out.println(v.toString());
        System.out.println(c.toString());
        Vehicle m= new Car ("name2");
        Vehicle d= new Truck();
        System.out.println(m.run());
        System.out.println(d.run());
    }
}
