package problem5;

//run
//javac problem5/*.java
//java problem5.TestPetSystem

public class TestPetSystem {

    public static void main(String[] args){

        Employee john = new Employee("John", 30, "Engineer");
        PhDStudent alice = new PhDStudent("Alice", 26, "AI");
        Student bob = new Student("Bob", 22, "Math");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal goldy = new Fish("Goldy", 1);

        john.assignPet(rex);
        alice.assignPet(murka);
        bob.assignPet(goldy);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("\n--- Initial Registry ---");
        registry.printRegistry();

        System.out.println("\n--- John leaves Rex with Alice ---");
        john.leavePetWith(alice);
        registry.printRegistry();

        System.out.println("\n--- John retrieves Rex from Alice ---");
        john.retrievePetFrom(alice);
        registry.printRegistry();
    }
}