package practice4.main;

import practice4.model.*;
import practice4.services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  проблем
        System.out.println("=== Problem 2 ===");

        Restaurant r = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student("Miras");

        r.servePizza(cat);
        r.servePizza(student);


        // 3 проблем
        System.out.println("\n=== Problem 3 ===");

        App app = new App();

        app.getStatistics(new LogicGame());
        app.getStatistics(new MemoryGame());

        iPhone phone = new iPhone();
        phone.sell();
        phone.plug();


        // 4 проблем
        System.out.println("\n=== Problem 4 ===");

        List<StudentSort> list = new ArrayList<>();

        list.add(new StudentSort("Miras", 3.0));
        list.add(new StudentSort("Aruzhan", 3.8));
        list.add(new StudentSort("Dias", 2.5));

        // gpa бойынща сорт
        Collections.sort(list);

        System.out.println("Sort by GPA:");
        for (StudentSort s : list) {
            System.out.println(s.name + " " + s.gpa);
        }

        // аттары бойынша сорт 
        Collections.sort(list, new NameComparator());

        System.out.println("\nSort by Name:");
        for (StudentSort s : list) {
            System.out.println(s.name + " " + s.gpa);
        }

        // бонус
        System.out.println("\n=== BONUS ===");

        int[] arr = {5, 3, 1, 4, 2, 5, 0};

        System.out.println("Counting Sort result:");
        CountingSort.sort(arr);
    }
}