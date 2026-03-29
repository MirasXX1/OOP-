package lab3.main;
import lab3.model.*;
import lab3.services.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Lab 3 бастаймыз ---");

        Bird b = new Bird();
        b.move();
        b.fly();

        System.out.println(); // Бос жол тастау

        Chocolate[] shokolad = new Chocolate[3];
        shokolad[0] = new Chocolate("Kazakhstan", 100);
        shokolad[1] = new Chocolate("Snickers", 50);
        shokolad[2] = new Chocolate("KitKat", 45);

        System.out.println("Сұрыптауға дейін:");
        for (Chocolate c : shokolad) System.out.println(c);

        Sort.bubbleSort(shokolad);

        System.out.println("\nСұрыптаудан кейін:");
        for (Chocolate c : shokolad) System.out.println(c);

        // Жұмысшыларды тексеру
        Employee emp1 = new Employee("Almas", 50000, new Date(), "001");
        Employee emp2 = new Employee("Sanzhar", 70000, new Date(), "002");

        if (emp1.compareTo(emp2) < 0) {
            System.out.println("\n" + emp2.fio + "-дын айлығы көп");
        }
    }
}