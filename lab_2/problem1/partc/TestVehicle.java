package problem1.partc;

import java.util.HashSet;

public class TestVehicle {

    public static void main(String[] args){

        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("Toyota", 2020, "Camry"));
        cars.add(new Car("Toyota", 2020, "Camry")); // duplicate
        cars.add(new Car("BMW", 2022, "X5"));

        for(Car c : cars){
            System.out.println(c);
        }

        System.out.println("Total cars in set: " + cars.size());
    }

}
//run
//javac problem1/partc/*.java
//java problem1.partc.TestVehicle