package practice3;

public class Temperature {

	private double temperature;
	private char scale;
	
	public Temperature (){
		this.temperature = 0;
		this.scale = 'C';
	}
	public Temperature (char letter) {
		this.temperature = 0;
		this.scale = letter;
	}
	public Temperature (double temp) {
		this.scale = 'C';
		this.temperature = temp;
	}
	public Temperature (double temp, char letter) {
		this.temperature = temp;
		this.scale = letter;
	}
	
	public double getCelcius(Temperature t) {
		if(t.scale == 'C') return t.temperature;
		else {
			t.temperature = 5 * (t.temperature - 32) / 9;
			t.scale = 'C';
			return t.temperature;
		}
	}
	public double getFahrenheit(Temperature t) {
		if(t.scale == 'F') return t.temperature;
		else {
			t.temperature = 9 * (t.temperature / 5) + 32;
			t.scale = 'F';
			return t.temperature;
		}
	}
	
	public void setScale (char letter) {
		this.scale = letter;
	}
	public void setTemp (double temp) {
		this.temperature = temp;
	}
	public void setBoth (double temp, char letter) {
		this.scale = letter;
		this.temperature = temp;
	}
	
	public char getScale() {
		return scale;
	}
	
}