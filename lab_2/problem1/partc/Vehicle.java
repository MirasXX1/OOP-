package problem1.partc;

import java.util.Objects;

public class Vehicle {

    private String brand;
    private int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Vehicle v = (Vehicle) o;

        return year == v.year && brand.equals(v.brand);
    }

    @Override
    public int hashCode(){
        return Objects.hash(brand, year);
    }

    @Override
    public String toString(){
        return brand + " (" + year + ")";
    }

}
//run
//javac problem1/partc/*.java
//java problem1.partc.TestVehicle