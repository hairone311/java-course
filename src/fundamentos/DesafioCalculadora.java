package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        double num1 = in.nextDouble();

        System.out.print("Digite o valor 2: ");
        double num2 = in.nextDouble();

        System.out.print("Seleccione a operação: ");
        String operation = in.next();

        // Logica
        double result = "+".equals(operation) ? num1 + num2 : 0;
        result = "-".equals(operation) ? num1 - num2 : result;
        result = "*".equals(operation) ? num1 * num2 : result;
        result = "/".equals(operation) ? num1 / num2 : result;
        result = "%".equals(operation) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, result);
        
        in.close();
    }
}
