package code.beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class EX_1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);
		
		int a, b, soma;
		
		a = Integer.parseInt(input.readLine());
		b = Integer.parseInt(input.readLine());
		
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
	}

}
