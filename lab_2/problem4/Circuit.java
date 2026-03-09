package problem4;

public abstract class Circuit {

    protected double potentialDiff; // V

    public abstract double getResistance();

    public double getPotentialDiff(){
        return potentialDiff;
    }

    public void applyPotentialDiff(double V){
        this.potentialDiff = V;
    }

    public double getCurrent(){
        return potentialDiff / getResistance();
    }

    public double getPower(){
        return potentialDiff * getCurrent();
    }
}