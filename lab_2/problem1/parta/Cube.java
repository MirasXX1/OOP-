package problem1.parta;

public class Cube extends Shape3D {

    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double volume(){
        return side * side * side;
    }

    @Override
    public double surfaceArea(){
        return 6 * side * side;
    }
}
//run
//javac problem1/parta/*.java
//java problem1.parta.TestShapes
