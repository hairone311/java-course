package arrays;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		double totalAlunoA = 0;
//		for (int i = 0; i < notasAlunoA.length; i++) {
//			totalAlunoA += notasAlunoA[i];
//		}
		
		for (double notaAlunoA: notasAlunoA) {
			totalAlunoA += notaAlunoA;
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.5;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
//		for (int i = 0; i < notasAlunoB.length; i++) {
//			totalAlunoB += notasAlunoB[i];
//		}
		
		for (double notaAlunoB: notasAlunoB) {
			totalAlunoB += notaAlunoB;
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
