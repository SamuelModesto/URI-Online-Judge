package Beginner;

import java.util.Scanner;

public class Ex_1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c, areaTriagulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		// Leitura dos dados
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		// �rea do triangulo retangulo
		areaTriagulo = a * c / 2;

		// �rea do c�rculo
		areaCirculo = pi * (c * c);

		// �rea do trap�zio
		areaTrapezio = (a + b) * c / 2;

		// �rea do quadrado
		areaQuadrado = b * b;
		
		//�rea do ret�ngulo
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %3.f\n", areaTriagulo);
		System.out.printf("CIRCULO: %3.f\n", areaCirculo);
		System.out.printf("TRAPEZIO: %3.f\n", areaTrapezio);
		System.out.printf("QUADRADO: %3.f\n", areaQuadrado);
		System.out.printf("RETANGULO: %3.f\n", areaRetangulo);

	}

}
