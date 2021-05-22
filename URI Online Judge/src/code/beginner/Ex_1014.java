package java.beginner;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex_1014 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int distancia;
		double gastoCombustivel;
		double autonomia;

		distancia = input.nextInt();
		gastoCombustivel = input.nextDouble();

		NumberFormat formatter = new DecimalFormat("#.000");

		autonomia = distancia / gastoCombustivel;

		System.out.println(formatter.format(autonomia) + " km/l");

	}

}
