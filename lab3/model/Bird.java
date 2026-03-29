package lab3.model;

import lab3.interfaces.*;

public class Bird implements Flyable {

    public void move() {
        System.out.println("Bird moves");
    }

    public void fly() {
        System.out.println("Bird flies");
    }
}