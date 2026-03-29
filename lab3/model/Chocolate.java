package lab3.model;

public class Chocolate implements Comparable<Chocolate> {
    public String brand;
    public double gramm;

    public Chocolate(String brand, double gramm) {
        this.brand = brand;
        this.gramm = gramm;
    }

    public String toString() {
        return brand + " (" + gramm + " gr)";
    }

    public int compareTo(Chocolate c) {
        // Double.compare-сіз жазу
        if (this.gramm > c.gramm) return 1;
        else if (this.gramm < c.gramm) return -1;
        return 0;
    }
}