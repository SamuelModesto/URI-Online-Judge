package Beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import java.util.Scanner;

public class Ex_1005 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);
		
		double a, b, media;
		
		a = Double.parseDouble(input.readLine());
		b = Double.parseDouble(input.readLine());
		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("type the values: ");		
//		a = entrada.nextDouble();
//		b = entrada.nextDouble();
		
		media = ((3.5 * a) + (7.5 * b))/11;
		
		NumberFormat formatter = new DecimalFormat("#.#####");
		
		System.out.println("MEDIA = " + formatter.format(media));
	}
}
