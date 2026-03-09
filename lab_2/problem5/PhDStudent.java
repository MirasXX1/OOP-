package problem5;

public class PhDStudent extends Person {

    private String researchField;

    public PhDStudent(String name, int age, String researchField){
        super(name, age);
        this.researchField = researchField;
    }

    @Override
    protected boolean canHavePet(Animal pet){
        return !(pet instanceof Dog); // PhD cannot have dogs
    }

    @Override
    public String getOccupation(){
        return "PhD Student - " + researchField;
    }
}