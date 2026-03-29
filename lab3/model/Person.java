package lab3.model;

public class Person {
    public String fio; 

    public Person(String fio) {
        this.fio = fio;
    }

    public String toString() {
        return "Person: " + fio;
    }
}