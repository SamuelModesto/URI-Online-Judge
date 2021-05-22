package code.beginner;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1011 {

	public static void main(String[] args)throws IOException {  
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14159;
		double R;
		double total;
		
		R = input.nextDouble();
		
		total = 4/3.0*pi * (R*R*R);
		
		System.out.printf("VOLUME = %.3f\n", total);
		

	}

}
