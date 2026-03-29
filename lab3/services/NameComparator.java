package lab3.services;

import lab3.model.Employee;
import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.fio.compareTo(e2.fio);
    }
}