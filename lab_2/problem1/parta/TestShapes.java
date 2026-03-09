package problem1.parta;

public class TestShapes {

    public static void main(String[] args){

        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder area: " + cylinder.surfaceArea());

        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Sphere area: " + sphere.surfaceArea());

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube area: " + cube.surfaceArea());
    }

}


//run
//javac problem1/parta/*.java
//java problem1.parta.TestShapes
