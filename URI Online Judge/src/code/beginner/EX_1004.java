package code.beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_1004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);
		
		int a, b, prod;
		
		a = Integer.parseInt(input.readLine());
		b = Integer.parseInt(input.readLine());
		
		prod = a*b;
		
		System.out.println("PROD = " + prod);
		

	}

}
