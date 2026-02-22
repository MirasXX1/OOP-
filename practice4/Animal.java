package practice4;

public class Animal {

    protected String name;

    public Animal() {
        System.out.println("Animal created");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal with name created");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void eat(String food) {
        System.out.println("Animal eats " + food);
    }

    public String toString() {
        return "Animal[name=" + name + "]";
    }
}