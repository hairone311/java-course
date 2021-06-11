package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso (Kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Altura (m): ");
        double altura = entrada.nextDouble();

        double iMC = peso / altura;
        System.out.printf("IMC = %.2f", iMC);

        entrada.close();
    }
}
