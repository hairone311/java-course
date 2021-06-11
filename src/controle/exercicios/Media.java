package controle.exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		/*
		 * Criar um programa que receba duas notas parciais, 
		 * calcular a média final. Se a nota do aluno for maior 
		 * ou igual a 7.0 imprime no console "Aprovado", se a 
		 * nota for menor que 7.0 e maior do que 4.0 imprime no 
		 * console "Recuperação", caso contrário imprime no console
		 *  "Reprovado". 
		 */
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Teste 1: ");
		double teste1 = entrada.nextDouble();
		
		System.out.print("Teste 2: ");
		double teste2 = entrada.nextDouble();
		
		double media = (teste1 + teste2) / 2;
		
		if (media >= 7) {
			System.out.println("Sua média foi " + media + " e você está de Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua média foi " + media + " e você está de Recuperação.");
		} else {
			System.out.println("Sua média foi " + media + " e você está Reprovado.");
		}

		entrada.close();
	}
}
