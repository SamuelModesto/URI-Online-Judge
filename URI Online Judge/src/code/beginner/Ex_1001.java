package code.beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_1001 {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);

		
		int A, B, X;
		
		A = Integer.parseInt(input.readLine());
		B = Integer.parseInt(input.readLine());

		
		X = A + B;
		
		System.out.println("X = " + X);
		
	}
}
