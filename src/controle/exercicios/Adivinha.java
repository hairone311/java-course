package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {

	public static void main(String[] args) {
		
		/*
		 * Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100. Armazene um
		 * numero aleat�rio em uma vari�vel. O Jogador tem 10 tentativas para adivinhar
		 * o n�mero gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o n�mero inserido � maior ou menor do que
		 * o n�mero armazenado.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Come�ou o jogo! Sera que consegue me vencer?");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = scanner.nextInt();

				if (numero > numeroSorteado) {
					System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);
				} else {
					System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
				}
			} while (numero != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = scanner.nextInt();
		} while (continuar != 0);

		scanner.close();
	}
}
