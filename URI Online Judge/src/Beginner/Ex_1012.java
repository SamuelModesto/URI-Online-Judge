package Beginner;

import java.util.Scanner;

public class Ex_1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c;
		double pi = 3.14159;
		
		// Leitura dos dados
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();	
		
		System.out.printf("TRIANGULO: %.3f\n", a * c / 2);
		System.out.printf("CIRCULO: %.3f\n",  (c * c) * pi );
		System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
		System.out.printf("QUADRADO: %.3f\n", b * b);
		System.out.printf("RETANGULO: %.3f\n", a * b);

	}

}
