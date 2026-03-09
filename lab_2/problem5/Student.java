package problem5;

public class Student extends Person {

    private String major;

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    @Override
    protected boolean canHavePet(Animal pet){
        return true; // Student can have any pet
    }

    @Override
    public String getOccupation(){
        return "Student - " + major;
    }
}