package controle.exercicios;

import java.util.Scanner;

public class AnoBisexto {

	public static void main(String[] args) {
		// Criar um programa informa se o ano atual � um ano bissexto
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ano: ");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.printf("O ano %d � bissexto!", ano);
		} else {
			System.out.printf("O ano %d n�o � bissexto!", ano);
		}
		
		entrada.close();
	}
}
