package problem5;

import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people;

    public PersonRegistry(){
        people = new ArrayList<>();
    }

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    public void printRegistry(){
        for(Person p : people){
            System.out.println(p);
        }
    }
}