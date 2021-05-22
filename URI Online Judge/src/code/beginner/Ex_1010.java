package code.beginner;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner entrada = new Scanner(System.in);
		
		int  codPro;
		int qtdPro;
		double precoPro;
		double total;
		int  codPro2;
		int qtdPro2;
		double precoPro2;
		
		codPro = entrada.nextInt();
		qtdPro = entrada.nextInt();
		precoPro = entrada.nextDouble();
		
		codPro2 = entrada.nextInt();
		qtdPro2 = entrada.nextInt();
		precoPro2 = entrada.nextDouble();
		
		total = (qtdPro*precoPro) + (qtdPro2*precoPro2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		


	}

}
