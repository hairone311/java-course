package fundamentos.exercicios;

import java.util.Scanner;

public class CelciusFahrenheit {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em Fahrenheit: ");
        double tf = entrada.nextDouble();

        double tc = ((tf - 32) * 5) / 9; // Formula: C = ((F - 32) x 5) / 9
        System.out.printf("%.2f ºF = %.2f ºC", tf, tc);

        entrada.close();
    }
}
