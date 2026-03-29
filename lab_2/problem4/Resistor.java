package problem4;

public class Resistor extends Circuit {
    //бул резистредин кедергиси

    private double resistance; 

    public Resistor(double resistance){
        this.resistance = resistance;
    }
//резистордын оз кедергисин кайтарады


    @Override
    public double getResistance(){
        return resistance;
    }
}