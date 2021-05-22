package code.beginner;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex_1015 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x1, y1, x2, y2, distancia;

		x1 = input.nextDouble();
		y1 = input.nextDouble();

		x2 = input.nextDouble();
		y2 = input.nextDouble();

		distancia = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

		NumberFormat formatter = new DecimalFormat("#.0000");

		System.out.println(formatter.format(distancia));

	}

}
