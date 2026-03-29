package practice4.model;

public class StudentSort implements Comparable<StudentSort> {

    public String name;
    public double gpa;

    public StudentSort(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(StudentSort other) {
        return Double.compare(this.gpa, other.gpa);
    }
}