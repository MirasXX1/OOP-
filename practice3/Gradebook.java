package practice3;
import java.util.ArrayList;

import practice3.Student;

public class Gradebook {

    private Course course;
    private ArrayList<Student> students;

    public Gradebook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public double determineClassAverage() {
        if (students.isEmpty()) return 0;

        double sum = 0;
        for (Student s : students) {
            sum += s.getGrade(); // 👈 ЕНДІ ДҰРЫС
        }
        return sum / students.size();
    }

    public Student getBestStudent() {
        if (students.isEmpty()) return null;

        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
    }

    public Student getWorstStudent() {
        if (students.isEmpty()) return null;

        Student worst = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < worst.getGrade()) {
                worst = s;
            }
        }
        return worst;
    }

    public void outputBarChart() {
        int a = 0, b = 0, c = 0, d = 0, f = 0;

        for (Student s : students) {
            double g = s.getGrade();

            if (g >= 90) a++;
            else if (g >= 80) b++;
            else if (g >= 70) c++;
            else if (g >= 60) d++;
            else f++;
        }

        System.out.println("Grade distribution:");
        System.out.println("A (90–100): " + a);
        System.out.println("B (80–89):  " + b);
        System.out.println("C (70–79):  " + c);
        System.out.println("D (60–69):  " + d);
        System.out.println("F (<60):    " + f);
    }

    public void displayGradeReport() {
        displayMessage();
        System.out.println("Class average: " + determineClassAverage());

        Student best = getBestStudent();
        Student worst = getWorstStudent();

        if (best != null)
            System.out.println("Highest grade: " + best);
        if (worst != null)
            System.out.println("Lowest grade: " + worst);

        outputBarChart();
    }
}
