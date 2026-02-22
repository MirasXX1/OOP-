
public class Main {
    public static void main(String[] args) {

        System.out.println("Student Example");
        Student stud = new Student("Miras", 1, 2024);
        stud.displayDetails();
        stud.incrementID();
        System.out.println("Posle incrementing ID:");
        stud.displayDetails();
        System.out.println();

        System.out.println("StarTriangle Example");
        StarTriangle triangle = new StarTriangle(4);
        System.out.println(triangle.toString());
        System.out.println();

        System.out.println("Uaqyt Mysal");
        Time t1 = new Time(23, 5, 6);
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());

        Time t2 = new Time(4, 24, 33);
        Time tSum = t1.add(t1, t2);
        System.out.println("Sum Universal: " + tSum.toUniversal());
        System.out.println("Sum Standard: " + tSum.toStandard());
    }
}
