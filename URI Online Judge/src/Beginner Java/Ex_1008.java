package Beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex_1008 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader (inputReader);
		
		int numFuncionario;
		int valorHora;
		double horasTrabalhadas;
		double salario;
		
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("type the values: ");
		numFuncionario = entrada.nextInt();
		valorHora = entrada.nextInt();
		horasTrabalhadas = entrada.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		
		NumberFormat formatter = new DecimalFormat("#.00");
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.println("SALARY = U$ " + formatter.format(salario));
		
		
	}

}
