package Beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ex_1010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inputReader);
		
		int codProd1;
		int qtdProd1;
		double precoProd1;
		
		int codProd2;
		int qtdProd2;
		double precoProd2;
		
		double total;
		
		codProd1 = Integer.parseInt(input.readLine());
		qtdProd1 = Integer.parseInt(input.readLine());
		precoProd1 = Double.parseDouble(input.readLine());
		
		codProd2 = Integer.parseInt(input.readLine());
		qtdProd2 = Integer.parseInt(input.readLine());
		precoProd2 = Double.parseDouble(input.readLine());
		
		total = (qtdProd1 * precoProd1) + (qtdProd2 * precoProd2);
		
		NumberFormat formatter = new DecimalFormat("#.00");
		
		System.out.println("VALOR A PAGAR: R$ " + formatter.format(total));
		


				
		
	}
	
	

}
