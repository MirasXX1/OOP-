package problem1.partb;

public class TestLibrary {

    public static void main(String[] args){

        Book book1 = new Book("Java Basics", "John Smith", 2020, 300);
        Book book2 = new Book("Algorithms", "Jane Doe", 2018, 500);

        System.out.println(book1);
        System.out.println(book2);
    }

}


//run
//javac problem1/partb/*.java
//java problem1.partb.TestLibrary