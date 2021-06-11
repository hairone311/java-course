package fundamentos.exercicios;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Base: ");
        double base = entrada.nextDouble();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double areaTriangulo = (base * altura) / 2;
        System.out.printf("Base: %.2f \nAltura: %.2f \nArea: %.2f",
                            base, altura, areaTriangulo);

        entrada.close();
    }
}
