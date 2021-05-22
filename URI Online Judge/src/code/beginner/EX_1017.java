package code.beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class EX_1017 {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int horas = entrada.nextInt();
        int velocidadePorHora = entrada.nextInt();
        double distanciaTotal = horas * velocidadePorHora;
        double resultado = distanciaTotal / 12;

        System.out.println(String.format("%.3f", resultado));
    }
}