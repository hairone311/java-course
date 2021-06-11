package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitCelcius {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em Celsius: ");
        double tc = entrada.nextDouble();

        double tf = ((tc * 9) / 5) + 32;
        System.out.printf("%.2f ºC = %.2f ºF", tc, tf);

        entrada.close();
    }
}
