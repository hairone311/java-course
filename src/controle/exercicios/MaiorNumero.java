package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maiorValor = 0;
		int valor;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o valor %d: ", i);
			valor = entrada.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}
		}

		System.out.println("O maior valor digitado foi: " + maiorValor);

		entrada.close();
	}
}
