package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Apelido: ");
        String apelido = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos de idade.", nome, apelido, idade);

        entrada.close();
    }
}
