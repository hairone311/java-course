package fundamentos.exercicios;

import java.util.Scanner;

public class quadradoCubo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();
        
        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("Valor: %.1f \nQuadrado: %.1f \nCubo: %.1f",
                        valor, quadrado, cubo);

        entrada.close();
    }
}
