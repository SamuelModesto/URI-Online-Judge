package code.beginner;

import java.util.Scanner;

public class Ex_1013 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		int maiorAb;
		int maiorBc;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		maiorAb = (a + b + Math.abs (a - b)) / 2;
		maiorBc = (maiorAb + c + Math.abs(maiorAb - c))/2;
		
		System.out.println(maiorBc + " eh o maior");
		
		
		
	}

}
