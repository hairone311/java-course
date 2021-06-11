package controle.exercicios;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int somadorDeNumeros = 0;
		int numero = 0;
		
		while (numero >= 0) {
			System.out.print("Digite um numero inteiro (negativo para sair): ");
			numero = entrada.nextInt();
			
			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("\nSoma actual: %d\n", somadorDeNumeros);
			}
		}
		
		entrada.close();
	}
}
