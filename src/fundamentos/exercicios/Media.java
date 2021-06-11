package fundamentos.exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Valor A: ");
		double valorA = entrada.nextDouble();

		System.out.print("Valor B: ");
		double valorB = entrada.nextDouble();

		double mediaAluno = (valorA * 0.35) + (valorB * 0.75);
		
		System.out.printf("MEDIA = %.5f ", mediaAluno);
		System.out.println();

		entrada.close();
	}
}
