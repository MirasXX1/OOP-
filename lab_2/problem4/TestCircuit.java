package problem4;

//run
//javac problem4/*.java
//java problem4.TestCircuit

public class TestCircuit {
    public static void main(String[] args){

        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        System.out.println("Total Resistance: " + circuit.getResistance() + " Ohms");

        circuit.applyPotentialDiff(12); // 12V applied

        System.out.println("Total Current: " + circuit.getCurrent() + " A");
        System.out.println("Total Power: " + circuit.getPower() + " W");
    }
}