package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        // Recebe 3 strings com os ultimos 3 salarios e calcula a media

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: ");
        String valor1 = in.next().replace(",", ".");

        System.out.print("Digite o segundo salario: ");
        String valor2 = in.next().replace(",", ".");
        
        System.out.print("Digite o terceiro salario: ");
        String valor3 = in.next().replace(",", ".");

        double mediaSalarial = (Double.parseDouble(valor1)
                                + Double.parseDouble(valor2)
                                + Double.parseDouble(valor3)) / 3;

        System.out.println("Media salarial: " + mediaSalarial);

        in.close();
    }
}
