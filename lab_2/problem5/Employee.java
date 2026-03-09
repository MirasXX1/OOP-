package problem5;

public class Employee extends Person {

    private String position;

    public Employee(String name, int age, String position){
        super(name, age);
        this.position = position;
    }

    @Override
    protected boolean canHavePet(Animal pet){
        return true; // Employee can have any pet
    }

    @Override
    public String getOccupation(){
        return "Employee - " + position;
    }
}