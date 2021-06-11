package fundamentos.exercicios;

import java.util.Scanner;

public class Equacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("A: ");
        double a = entrada.nextDouble();

        System.out.print("B: ");
        double b = entrada.nextDouble();

        System.out.print("C: ");
        double c = entrada.nextDouble();

        double delta = (Math.pow(b, 2)) - 4 * a * c;
        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        System.out.println("\nDelta = " + delta);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

        entrada.close();
    }
}
