//Код интерактивті түрде студенттердің мәліметтерін қабылдап, 
// курс бойынша бағалар тізімін шығарады.

package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class GradebookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

ArrayList<String> prereqs = new ArrayList<>(); 
Course course = new Course(
        "CS101",
        "Object-Oriented Programming",
        3,
        prereqs  
);


        Gradebook gradeBook = new Gradebook(course);

        System.out.println("Please, input number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("Student " + i + " name:");
            String name = scanner.nextLine();

            System.out.println("Student " + i + " id:");
            int id = scanner.nextInt();

            System.out.println("Student " + i + " grade (0–100):");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // буфер таза

            Student student = new Student(name, id, grade);
            gradeBook.addStudent(student);
        }

        System.out.println();
        gradeBook.displayGradeReport();
        scanner.close();
    }
}
