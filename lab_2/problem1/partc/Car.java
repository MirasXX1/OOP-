package problem1.partc;

import java.util.Objects;

public class Car extends Vehicle {

    private String model;

    public Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    @Override
    public boolean equals(Object o){
        if(!super.equals(o)) return false;

        Car c = (Car) o;
        return model.equals(c.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString(){
        return super.toString() + " - " + model;
    }

}


//run
//javac problem1/partc/*.java
//java problem1.partc.TestVehicle