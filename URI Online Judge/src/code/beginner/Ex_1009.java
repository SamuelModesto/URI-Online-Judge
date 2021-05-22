package code.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ex_1009 {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);

		String name;
		double salary;
		double totalSell;
		double total;

		name = input.readLine();
		salary = Double.parseDouble(input.readLine());
		totalSell = Double.parseDouble(input.readLine());

		total = salary + totalSell * 0.15;

		NumberFormat formatter = new DecimalFormat("#.00");

		System.out.println("TOTAL = R$ " + formatter.format(total));

	}

}
