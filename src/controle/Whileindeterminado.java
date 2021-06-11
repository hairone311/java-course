package controle;

import java.util.Scanner;

public class Whileindeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Comando: ");
			palavra = entrada.next();
		}
		
		entrada.close();
	}
}
