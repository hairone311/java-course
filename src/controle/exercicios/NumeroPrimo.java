package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// Criar um programa que receba um número e diga se ele é um número primo.
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();
		int contadorDeDivisores = 0;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.printf("%d é um número primo.", numero);
		} else {
			System.out.printf("%d não é um número primo.", numero);
		}
		
		entrada.close();
	}
}
