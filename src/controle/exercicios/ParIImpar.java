package controle.exercicios;

import java.util.Scanner;

public class ParIImpar {

	public static void main(String[] args) {
		// Criar um programa que receba um n�mero e verifique se ele est� entre 0 e 10 e � par
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.printf("O numero %d est� entra 0 e 10 e � um par.", numero);				
			} else {
				System.out.printf("O numero %d est� entre 0 e 10 mas n�o � um par.", numero);
			}
		} else {
			System.out.printf("O numero %d n�o est� entre 0 e 10.", numero);
		}

		entrada.close();
	}
}
