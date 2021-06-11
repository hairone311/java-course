package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int quantidadeDeNotas;
		double mediaFinal;
		double somaNotasAluno = 0;

		System.out.print("Quantas notas voce quer informar? ");
		quantidadeDeNotas = entrada.nextInt();

		double[] notasDoAluno = new double[quantidadeDeNotas];

		for (int i = 0; i < notasDoAluno.length; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			notasDoAluno[i] = entrada.nextDouble();
		}
		
		for (double notaDoAluno: notasDoAluno) {
			somaNotasAluno += notaDoAluno;
		}
		
		mediaFinal = somaNotasAluno / notasDoAluno.length;
		
		System.out.println("Media final: " + mediaFinal);

		entrada.close();
	}
}
