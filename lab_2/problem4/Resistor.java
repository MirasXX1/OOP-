package problem4;

public class Resistor extends Circuit {

    private double resistance; // Ohms

    public Resistor(double resistance){
        this.resistance = resistance;
    }

    @Override
    public double getResistance(){
        return resistance;
    }
}