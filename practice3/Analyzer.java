//жалпы логикасы қолданушы сандарды енгізеди сосын биз  орташа манин avrg
//және максималды манин мах есептеу.


package practice3;

import java.util.Scanner;

public class Analyzer {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		String input = "";
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter your number! (Type Q to quit): ");
			input = scanner.nextLine();
			try {
				if(input.equals("Q")) break;
			    double dnum = Double.parseDouble(input);
			    data.Add(dnum);
			} catch (NumberFormatException e) { // егер кате болса оны 
			    System.err.println("Invalid string format: " + e.getMessage());
			}
		}
		System.out.println("Average is " + data.Avrg());
		System.out.println("Max is " + data.Max());
	}
	
}