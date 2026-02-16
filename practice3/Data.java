package practice3;

public class Data {
	
	private double sum;
	private double mx;
	private int cnt;
	
	public Data() {
		sum = 0;
		mx = Double.NEGATIVE_INFINITY;
		cnt = 0;
	}
	
	public void Add(double num) {
		sum += num;
		cnt++;
		if(mx < num) mx = num;
	}
	
	public double Avrg() {
		if(cnt == 0) return 0;
		return sum/cnt;
	}
	
	public double Max() {
		return mx;
	}
	
}