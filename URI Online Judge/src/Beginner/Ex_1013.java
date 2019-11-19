package Beginner;

import java.util.Scanner;

public class Ex_1013 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		double maior;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		maior = (a + b + Math.abs (a - b)) / 2;
		
		System.out.printf(maior + " eh o maior");
		
	}

}
