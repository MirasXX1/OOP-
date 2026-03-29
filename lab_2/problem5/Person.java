package problem5;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        //бул жерде итти адамга тагайындайды мысалы phdstud ит устай алмайды 
    }


    public void assignPet(Animal pet){
        if(canHavePet(pet)){
            this.pet = pet;
            System.out.println(name + " now owns " + pet.getName());
        } else {
            System.out.println(name + " cannot have this pet!");
        }
    }
//адамнын колындагы жанауап жойылады


    public void removePet(){
        if(pet != null){
            System.out.println(name + " removed pet " + pet.getName());
            pet = null;
        }
    }

    public boolean hasPet(){
        return pet != null;
    }

    public Animal getPet(){
        return pet;
    }

    public void leavePetWith(Person other){
        if(pet != null){
            if(other.canHavePet(pet)){
                other.assignPet(pet);
                this.pet = null;
                System.out.println(name + " left pet with " + other.name);
            } else {
                System.out.println(other.name + " cannot take this pet!");
            }
        } else {
            System.out.println(name + " has no pet to leave!");
        }
    }

    public void retrievePetFrom(Person other){
        if(other.hasPet() && other.getPet() != null){
            if(canHavePet(other.getPet())){
                this.pet = other.getPet();
                other.removePet();
                System.out.println(name + " retrieved pet from " + other.name);
            } else {
                System.out.println(name + " cannot take back this pet!");
            }
        } else {
            System.out.println(other.name + " has no pet for " + name);
        }
    }

    protected abstract boolean canHavePet(Animal pet);

    public abstract String getOccupation();

    @Override
    public String toString(){
        String petInfo = (pet != null) ? pet.getName() + " (" + pet.getSound() + ")" : "No pet";
        return name + ", Age: " + age + ", Occupation: " + getOccupation() + ", Pet: " + petInfo;
    }
}