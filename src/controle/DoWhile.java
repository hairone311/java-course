package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) sentenca; ou {}
		// while(...) sentenca; ou {}
		// for(...;...;...) sentenca; ou {}
		
		Scanner entrada = new Scanner(System.in);

		String palavra = "";
		
		// do sentenca ou {} while(...);
		do {
			System.out.println("Voce precisa falar a palavra magica...");
			System.out.print("Quer sair? ");
			palavra = entrada.nextLine();
		} while(!palavra.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");

		entrada.close();
	}
}
