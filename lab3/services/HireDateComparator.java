package lab3.services;

import lab3.model.Employee;
import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee empFirst, Employee empSecond) {
        // Жұмысқа тұрған күні бойынша салыстыру
        // Date класында дайын compareTo бар екенін ұмытпау керек
        return empFirst.date.compareTo(empSecond.date);
    }
}