package controle;

import java.util.Scanner;

public class Desafiowhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double total = 0;
		double nota = 0;
		int quantidadeDeNotas = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota invalida!");
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Media: " + media);

		entrada.close();
	}
}
