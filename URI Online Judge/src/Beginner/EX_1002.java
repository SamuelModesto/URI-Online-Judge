package Beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import java.util.Scanner;

public class EX_1002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);
		
		
		double n = 3.14159;
		double A, R;
		
		R = Double.parseDouble(input.readLine());
		
//		Scanner entrada = new Scanner(System.in);		
//		System.out.println("type the values: ");	
//		R = entrada.nextDouble();
		
		A = n * (R*R);
			
		NumberFormat formatter = new DecimalFormat("#.####");
		System.out.println("A = " + formatter.format(A)); 
		
	}

}
