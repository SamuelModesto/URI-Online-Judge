package code.beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex_1007 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);

		int A, B, C, D, diferenca;
		
		A = Integer.parseInt(input.readLine());
		B = Integer.parseInt(input.readLine());
		C = Integer.parseInt(input.readLine());
		D = Integer.parseInt(input.readLine());
		

		diferenca = (A*B) - (C*D);
		
		System.out.println("DIFERENCA = " + diferenca);

	}
}
