package problem4;

public class Series extends Circuit {

    private Circuit c1, c2;

    public Series(Circuit c1, Circuit c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance(){
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public void applyPotentialDiff(double V){
        super.applyPotentialDiff(V);
        double I = getCurrent();
        c1.applyPotentialDiff(I * c1.getResistance());
        c2.applyPotentialDiff(I * c2.getResistance());
    }
}