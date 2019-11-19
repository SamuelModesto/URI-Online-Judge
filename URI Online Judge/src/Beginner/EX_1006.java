package Beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class EX_1006 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);

		double a, b, c, media;
		
		a = Double.parseDouble(input.readLine());
		b = Double.parseDouble(input.readLine());
		c = Double.parseDouble(input.readLine());
		
		
		
		media = (2*a + 3*b + 5*c)/10;

		
		NumberFormat formatter = new DecimalFormat("0.0");
		
		System.out.println("MEDIA = " + formatter.format(media));
		
		

	}

}
