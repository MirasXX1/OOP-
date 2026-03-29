package lab3.model;

import java.util.*;

public class Manager extends Employee {

    // Студенттер Vector-ды көбіне "spisok" деп атай салады
    public Vector<Employee> subordinates = new Vector<>(); 
    public double bonus_aksha; // бонус мөлшері

    public Manager(String fio, double zarplata, Date d, String id, double bonus_aksha) {
        // Super арқылы аталық кластың конструкторын шақырамыз
        super(fio, zarplata, d, id);
        this.bonus_aksha = bonus_aksha;
    }

    @Override
    public String toString() {
        // super.toString() қолданып, соңына бонусты қосамыз
        return super.toString() + " + бонус: " + bonus_aksha;
    }

    @Override
    public boolean equals(Object obj) {
        // Егер бұл объект Manager болмаса, бірден false
        if (!(obj instanceof Manager)) {
            return false;
        }
        
        Manager otherMan = (Manager) obj;
        
        // Айлығы мен бонусы бірдей ме екенін тексереміз
        boolean salarySame = (this.zarplata == otherMan.zarplata);
        boolean bonusSame = (this.bonus_aksha == otherMan.bonus_aksha);
        
        return salarySame && bonusSame;
    }

    @Override
    public int compareTo(Employee e) {
        // Алдымен мұғалім сұрағандай Manager екенін тексереміз
        if (e instanceof Manager) {
            Manager m = (Manager) e;
            
            // Егер айлықтары бірдей болса, бонусына қараймыз
            if (this.zarplata == m.zarplata) {
                if (this.bonus_aksha > m.bonus_aksha) return 1;
                if (this.bonus_aksha < m.bonus_aksha) return -1;
                return 0;
            }
        }
        // Әйтпесе Employee-нің салыстыруын қолданамыз
        return super.compareTo(e);
    }
}