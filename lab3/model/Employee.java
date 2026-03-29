package lab3.model;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    public double zarplata; // salary -> zarplata
    public Date date;
    public String id;

    public Employee(String fio, double zarplata, Date date, String id) {
        super(fio);
        this.zarplata = zarplata;
        this.date = date;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp: " + fio + ", salary: " + zarplata;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee other = (Employee) obj;
            return this.zarplata == other.zarplata && this.fio.equals(other.fio);
        }
        return false;
    }

    public int compareTo(Employee e) {
        if (this.zarplata > e.zarplata) return 1;
        if (this.zarplata < e.zarplata) return -1;
        return 0;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}