package problem1.partb;

public class Book extends LibraryItem {

    private int pages;

    public Book(String title, String author, int year, int pages){
        super(title, author, year);
        this.pages = pages;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public String toString(){
        return super.toString() + ", Pages: " + pages;
    }
}

//run
//javac problem1/partb/*.java
//java problem1.partb.TestLibrary