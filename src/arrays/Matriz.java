package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeAlunos;
		int quantidadeNotas;

		System.out.print("Quantos alunos? ");
		quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		quantidadeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double [quantidadeAlunos][quantidadeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informa a nota do aluno %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("Media da tura: " + media);
		
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
	}
}
