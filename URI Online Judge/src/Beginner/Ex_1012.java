package Beginner;

import java.util.Scanner;

public class Ex_1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c;
		
		// Leitura dos dados
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();	
		
		System.out.printf("TRIANGULO: %3.f\n", a * c / 2);
		System.out.printf("CIRCULO: %3.f\n",  (c * c) * 3.14159);
		System.out.printf("TRAPEZIO: %3.f\n", (a + b) * c / 2);
		System.out.printf("QUADRADO: %3.f\n", b * b);
		System.out.printf("RETANGULO: %3.f\n", a * b);

	}

}
